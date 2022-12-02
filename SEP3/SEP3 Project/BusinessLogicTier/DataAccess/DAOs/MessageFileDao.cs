using Application.DaoInterfaces;
using DataAccess.ProtoConverters;
using Domain.DTOs;
using Grpc.Core;
using Grpc.Net.Client;
using gRPCClient;
using Message = Domain.Models.Message;

namespace FileData.DAOs;

public class MessageFileDao : IMessageDao
{
    
    private readonly GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
    private MessageService.MessageServiceClient MessageClient;

    public MessageFileDao()
    {
        MessageClient = new(channel);
    }

    public async Task<Message> CreateAsync(MessageCreationDto post)
    {
        gRPCClient.Message message = await MessageClient.createMessageAsync(
        new CreateMessageDTO{
                Content = post.content,
                SenderId = post.senderId,
                ConversationId = post.conversationId
            }
        );

        return ClassConverter.ConvertProtoToDomain(message);

    }

    public async Task<List<Message>> GetByConversationIdAsync(int conversationId)
    {

        List<Message> messages = new();

        using var call = MessageClient.getMessagesByConversationId(
            new SearchMessageDTO() { Id = conversationId });

        await foreach (var response in call.ResponseStream.ReadAllAsync())
        {
            messages.Add(ClassConverter.ConvertProtoToDomain(response));
        }

        return messages;

    }

    public async Task<Message> GetByIdAsync(int id)
    {
        gRPCClient.Message message = await MessageClient.getMessageByIdAsync(
            new SearchMessageDTO
            {
                Id = id
            }
        );

        return ClassConverter.ConvertProtoToDomain(message);
    }

    public async Task DeleteMessageByIdAsync(int id)
    {
        await MessageClient.deleteMessageByIdAsync(new SearchMessageDTO() { Id = id });
    }
}