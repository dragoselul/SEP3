using Domain.Models;

namespace Application.LogicInterfaces;

public interface INotificationLogic
{
    Task<List<Notification>> GetNotificationsByUserId(int id);
    void DeleteNotificationById(int id);
    void DeleteNotificationsByUserId(int id);
}