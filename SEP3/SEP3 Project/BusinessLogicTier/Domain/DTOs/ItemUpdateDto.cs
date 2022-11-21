namespace Domain.DTOs;

public class ItemUpdateDto
{
    public int Id { get; init; }
    public int OwnerId { get; init; }
    public string? ContactFirstName { get; }
    public string? ContactLastName { get; }
    public string? Name { get; set; }
    public string? Description { get; }
    public int? ContactId { get; }
    public double? Pricing { get; }
    public string? Category { get; }
    public string? Currency { get; }

    public bool? IsSold { get; }
    // public byte[] Photos { get;}
}