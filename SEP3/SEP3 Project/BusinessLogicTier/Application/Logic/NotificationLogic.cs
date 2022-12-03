using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Domain.Models;

namespace Application.Logic;

public class NotificationLogic : INotificationLogic
{
    private readonly INotificationDao dao;

    public NotificationLogic(INotificationDao dao)
    {
        this.dao = dao;
    }
    
    public Task<List<Notification>> GetNotificationsByUserId(int id)
    {
        return dao.GetNotificationsByUserId(id);
    }

    public void DeleteNotificationById(int id)
    {
        dao.DeleteNotificationById(id);
    }

    public void DeleteNotificationsByUserId(int id)
    {
        dao.DeleteNotificationsByUserId(id);
    }
}