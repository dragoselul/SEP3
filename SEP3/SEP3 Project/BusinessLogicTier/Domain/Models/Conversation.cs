namespace Domain.Models;

public class Conversation
{
    public long Id { get; init;}
    public User Buyer { get; init;}
    public User Seller { get; init;}
    public Item Item { get; init;}
    public List<Message> MessageList { get; init;}
    public DateTime DateTimeOfStart { get; init;}

    // public Conversation(long id, User buyer, User seller, Item item, List<Message> messageList, DateTime dateTimeOfStart)
    // {
    //     Id = id;
    //     Buyer = buyer;
    //     Seller = seller;
    //     Item = item;
    //     MessageList = messageList;
    //     DateTimeOfStart = dateTimeOfStart;
    // }

}