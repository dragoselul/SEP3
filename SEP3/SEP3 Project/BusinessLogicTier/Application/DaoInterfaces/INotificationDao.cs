using Domain.Models;

namespace Application.DaoInterfaces;

public interface INotificationDao
{
    Task<List<Notification>> GetNotificationsByUserId(int id);
    void DeleteNotificationById(int id);
    void DeleteNotificationsByUserId(int id);
}