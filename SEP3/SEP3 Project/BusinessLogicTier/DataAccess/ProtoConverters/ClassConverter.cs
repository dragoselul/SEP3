using Google.Protobuf.Collections;
using gRPCClient;
using Conversation = Domain.Models.Conversation;
using Image = Domain.Models.Image;
using Item = Domain.Models.Item;
using User = Domain.Models.User;
using Message = Domain.Models.Message;
using Notification = Domain.Models.Notification;

namespace DataAccess.ProtoConverters;

public abstract class ClassConverter
{
    
    public static DateTime ConvertProtoToDomain(LocalDateTime dateTime)
    {
        return new DateTime(
            dateTime.Year,
            dateTime.Month,
            dateTime.Day,
            dateTime.Hour,
            dateTime.Minute,
            0
        );
    }
    
    public static User ConvertProtoToDomain(gRPCClient.User user)
    {
        return new User()
        {
            dor = ConvertProtoToDomain(user.DateOfRegistration),
            email = user.Email,
            firstName = user.FirstName,
            lastName = user.LastName,
            gender = user.Gender,
            Id = (int)user.Id,
            ItemsList = new List<Item>(),
            password = user.Password,
            phoneNumber = user.PhoneNumber,
            // TODO CHANGE SECURITY LEVEL
            SecurityLevel = 1
        };
    }

    public static Item ConvertProtoToDomain(gRPCClient.Item item)
    {
        return new Item()
        {
            Category = item.Category,
            Owner = ConvertProtoToDomain(item.Owner),
            Description = item.Description,
            Currency = item.Currency,
            IsSold = item.Status,
            Id = (int)item.Id,
            Name = item.Name,
            Pricing = item.Price
        };
    }

    public static Message ConvertProtoToDomain(gRPCClient.Message message)
    {
        return new Message()
        {
            Id = message.Id,
            Content = message.Content,
            DateTimeSent = ConvertProtoToDomain(message.DateTimeSent),
            Sender = ConvertProtoToDomain(message.Sender)
        };
    }

    // TODO BETTER WAY?
    public static List<Message> ConvertProtoToDomain(RepeatedField<gRPCClient.Message> messages)
    {
        List<Message> newList = new();
        foreach (var message in messages)
        {
            newList.Add(ConvertProtoToDomain(message));
        }

        return newList;
    }

    public static Conversation ConvertProtoToDomain(gRPCClient.Conversation conversation)
    {
        Conversation conv = new Conversation()
        {
            Buyer = ConvertProtoToDomain(conversation.Buyer),
            Seller = ConvertProtoToDomain(conversation.Seller),
            Item = ConvertProtoToDomain(conversation.Item),
            DateTimeOfStart = ConvertProtoToDomain(conversation.DateOfStart),
            Id = conversation.Id,
            MessageList = ConvertProtoToDomain(conversation.Messages)
        };
        return conv;
    }

    public static Image ConvertProtoToDomain(gRPCClient.Image image)
    {
        Image toDomain = new()
        {
            Id = image.Id,
            base64data = image.Base64Data,
            contentType = image.ContentType,
            fileName = image.FileName,
            ItemId = image.ItemId
        };
        return toDomain;
    }

    public static Notification ConvertProtoToDomain(gRPCClient.Notification notification)
    {
        return new Notification
        {
            Id = notification.Id,
            DateSent = ConvertProtoToDomain(notification.DateSent),
            Message = notification.Message,
            NotificationType = notification.NotificationType,
            NotificationTypeId = notification.NotificationTypeId,
            OwnerId = notification.OwnerId,
            Title = notification.Title
        };
    }
    
}