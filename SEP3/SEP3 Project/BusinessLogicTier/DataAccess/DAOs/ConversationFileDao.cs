using Grpc.Net.Client;
using gRPCClient;

namespace FileData.DAOs;

public class ConversationFileDao
{
    private readonly GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
    private 
}