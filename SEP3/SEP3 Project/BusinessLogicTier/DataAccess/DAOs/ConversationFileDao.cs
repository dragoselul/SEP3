using Grpc.Net.Client;
using Application.DaoInterfaces;
using DataAccess.ProtoConverters;
using Domain.DTOs;
using Google.Protobuf.Collections;
using gRPCClient;
using Conversation = Domain.Models.Conversation;
using Item = Domain.Models.Item;
using User = Domain.Models.User;

namespace FileData.DAOs;

public class ConversationFileDao : IConversationDao
{
    private readonly GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
    private ConversationService.ConversationServiceClient? ConversationClient;

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

        try
        {
            while (true)
            {
                gRPCClient.Conversation? conv = ConversationClient.getConversationsByUser(
                        new SearchConversationDTO() { Id = userId })
                    .ResponseStream.Current;
                conversations.Add(ClassConverter.ConvertProtoToDomain(conv));
            }
        }
        catch (Exception e)
        {
            Console.WriteLine("We got all the items");
        }

        return await Task.FromResult(conversations);

    }

    public async Task<Conversation> GetByIdAsync(int id)
    {
        gRPCClient.Conversation conversation = await 
            ConversationClient.getConversationByIdAsync(new SearchConversationDTO() { Id = id });
        return ClassConverter.ConvertProtoToDomain(conversation);

    }



}