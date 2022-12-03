using Application.DaoInterfaces;
using DataAccess.ProtoConverters;
using Grpc.Core;
using Grpc.Net.Client;
using gRPCClient;
using Notification = Domain.Models.Notification;

namespace DataAccess.DAOs;

public class NotificationFileDao : INotificationDao
{
    
    private readonly GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
    private NotificationService.NotificationServiceClient NotificationClient;

    public NotificationFileDao()
    {
        NotificationClient = new NotificationService.NotificationServiceClient(channel);
    }

    public async Task<List<Notification>> GetNotificationsByUserId(int id)
    {
        List<Notification> conversations = new();
        
        AsyncServerStreamingCall<gRPCClient.Notification> call = NotificationClient.getNotificationsByUser(new SearchNotificationDTO(){Id=id});
        await foreach (var response in call.ResponseStream.ReadAllAsync())
        {
            conversations.Add(ClassConverter.ConvertProtoToDomain(response));
        }

        return await Task.FromResult(conversations);
    }

    public async void DeleteNotificationById(int id)
    {
        await NotificationClient.deleteNotificationByIdAsync(new SearchNotificationDTO()
        {
            Id = id
        });
    }

    public async void DeleteNotificationsByUserId(int id)
    {
        await NotificationClient.deleteNotificationsByUserIdAsync(new SearchNotificationDTO()
        {
            Id = id
        });
    }
}