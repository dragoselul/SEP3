namespace Domain.Models;

public class Conversation
{
    private long Id { get; }
    private User Buyer { get; }
    private User Seller { get; }
    private Item Item { get; }
    private List<Message> MessageList { get; }
    private DateTime DateTimeOfStart { get; }

    public Conversation(long id, User buyer, User seller, Item item, List<Message> messageList, DateTime dateTimeOfStart)
    {
        Id = id;
        Buyer = buyer;
        Seller = seller;
        Item = item;
        MessageList = messageList;
        DateTimeOfStart = dateTimeOfStart;
    }

}