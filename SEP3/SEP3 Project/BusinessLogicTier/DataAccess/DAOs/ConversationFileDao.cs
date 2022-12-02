using Grpc.Net.Client;
using Application.DaoInterfaces;
using DataAccess.ProtoConverters;
using Domain.DTOs;
using Google.Protobuf.Collections;
using Grpc.Core;
using gRPCClient;
using Conversation = Domain.Models.Conversation;

namespace FileData.DAOs;

public class ConversationFileDao : IConversationDao
{
    private readonly GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
    private ConversationService.ConversationServiceClient ConversationClient;

    public ConversationFileDao()
    {
        ConversationClient = new(channel);
    }

    // TODO IMPLEMENT 
    public async Task<Conversation> CreateAsync(ConversationCreationDto post)
    {
        gRPCClient.Conversation created = await ConversationClient.createConversationAsync(
            new CreateConversationDTO
            {
                SellerId = post.SellerId,
                BuyerId = post.BuyerId,
                ItemId = post.ItemId
            }
        );
        return ClassConverter.ConvertProtoToDomain(created);
    }

    public async Task<List<Conversation>> GetByUserIdAsync(int userId)
    {
        List<Conversation> conversations = new();
        
        AsyncServerStreamingCall<gRPCClient.Conversation> call = ConversationClient.getConversationsByUser(new SearchConversationDTO(){Id=userId});
        await foreach (var response in call.ResponseStream.ReadAllAsync())
        {
            conversations.Add(ClassConverter.ConvertProtoToDomain(response));
        }

        return await Task.FromResult(conversations);

    }

    public async Task<Conversation> GetByIdAsync(int id)
    {
        gRPCClient.Conversation conversation = await 
            ConversationClient.getConversationByIdAsync(new SearchConversationDTO() { Id = id });
        return ClassConverter.ConvertProtoToDomain(conversation);

    }

    public async Task DeleteByIdAsync(int id)
    {
        await ConversationClient.deleteConversationByIdAsync(new SearchConversationDTO
        {
            Id = id
        });
    }
}