namespace Domain.Models;

public class Message
{

    private long Id { get; }
    private string Content { get; }
    private User Sender { get; }
    private DateTime DateTimeSent { get; }

    public Message(long id, string content, User sender, DateTime dateTimeSent)
    {
        Id = id;
        Content = content;
        Sender = sender;
        DateTimeSent = dateTimeSent;
    }

}