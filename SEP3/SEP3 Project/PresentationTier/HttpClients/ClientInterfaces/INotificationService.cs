
using Domain.Models;

public interface INotificationService
{
    Task<List<Notification>> GetNotificationsByUserId(int id);
    void DeleteNotificationById(int id);
    void DeleteNotificationsByUserId(int id);
}