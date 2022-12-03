namespace Domain.DTOs;

public class MessageCreationDto
{
    public int senderId { get; }
    public int conversationId { get; }
    public string content { get; }

    public MessageCreationDto(int senderId, int conversationId, string content)
    {
        this.senderId = senderId;
        this.conversationId = conversationId;
        this.content = content;
    }
}