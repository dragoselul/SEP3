namespace Domain.Models;

public class Message
{

    public long Id { get; init;}
    public string Content { get; init;}
    public User Sender { get; init;}
    public DateTime DateTimeSent { get; init;}

}