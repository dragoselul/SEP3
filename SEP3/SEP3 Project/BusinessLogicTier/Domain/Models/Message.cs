namespace Domain.Models;

public class Message
{

    public long Id { get; }
    public string Content { get; }
    public User Sender { get; }
    public DateTime DateTimeSent { get; }

    public Message(long id, string content, User sender, DateTime dateTimeSent)
    {
        Id = id;
        Content = content;
        Sender = sender;
        DateTimeSent = dateTimeSent;
    }

}