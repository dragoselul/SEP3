using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface INotificationService
{
    Task<List<Notification>> GetNotificationsByUserId(int id);
    void DeleteNotificationById(int id);
    void DeleteNotificationsByUserId(int id);
}