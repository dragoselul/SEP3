namespace Domain.Models;

public class Conversation
{
    public long Id { get; }
    public User Buyer { get; }
    public User Seller { get; }
    public Item Item { get; }
    public List<Message> MessageList { get; }
    public DateTime DateTimeOfStart { get; }

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