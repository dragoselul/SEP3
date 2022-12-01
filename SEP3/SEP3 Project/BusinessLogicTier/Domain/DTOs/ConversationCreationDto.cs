namespace Domain.DTOs;

public class ConversationCreationDto
{
    private int? sellerId { get; }
    private int? buyerId { get; }
    private int? itemId { get; }

    public ConversationCreationDto(int? sellerId, int? buyerId, int? itemId)
    {
        this.sellerId = sellerId;
        this.buyerId = buyerId;
        this.itemId = itemId;
    }
}