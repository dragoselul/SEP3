using Grpc.Net.Client;
using gRPCClient;
using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;
using Grpc.Core;
using Grpc.Net.Client;
using gRPCClient;
using Item = Domain.Models.Item;

namespace FileData.DAOs;

public class ConversationFileDao : IConversationDao
{
    private readonly GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");

    // TODO IMPLEMENT 
    public ConversationFileDao()
    {
        
    }

    // TODO IMPLEMENT 
    public Task<Conversation> CreateAsync(ConversationCreationDto post)
    {
        throw new NotImplementedException();
    }

    // TODO IMPLEMENT 
    public Task<List<Conversation>> GetByUserIdAsync(int userId)
    {
        throw new NotImplementedException();
    }

    // TODO IMPLEMENT 
    public Task<Conversation> GetByIdAsync(int id)
    {
        throw new NotImplementedException();
    }
}