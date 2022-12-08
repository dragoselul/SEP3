namespace Domain.DTOs;

public class ItemUpdateDto
{
    
    public int Id { get; init; }
    public int OwnerId { get; init; }
    public string? Name { get; set; }
    public string? Description { get; set; }
    public double? Pricing { get; set; }
    public string? Category { get; set; }
    public string? Currency { get; set; }
    public bool? IsSold { get; set; } 
    // public byte[] Photos { get;}

    public ItemUpdateDto(int id)
    {
        Id = id;
    }
}