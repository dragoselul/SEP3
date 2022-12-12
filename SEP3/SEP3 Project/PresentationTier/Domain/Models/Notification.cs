namespace Domain.Models;

public class Notification
{
    public long Id { get; init; } 
    public long OwnerId { get; init; }
    public string Message { get; init; }
    public string Title { get; init; }
    public string NotificationType { get; init; }
    public long NotificationTypeId { get; init; }
    public DateTime DateSent { get; init; }
}