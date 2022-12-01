namespace Domain.DTOs;

public class ConversationCreationDto
{
    public int SellerId { get; }
    public int BuyerId { get; }
    public int ItemId { get; }

    public ConversationCreationDto(int sellerId, int buyerId, int itemId)
    {
        this.SellerId = sellerId;
        this.BuyerId = buyerId;
        this.ItemId = itemId;
    }
}