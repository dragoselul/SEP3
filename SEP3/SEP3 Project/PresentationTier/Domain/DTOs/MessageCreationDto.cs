namespace Domain.DTOs;

public class MessageCreationDto
{
    public int senderId { get; set; }
    public int conversationId { get; set; }
    public string content { get; set; }

    public MessageCreationDto(int senderId, int conversationId, string content)
    {
        this.senderId = senderId;
        this.conversationId = conversationId;
        this.content = content;
    }
}