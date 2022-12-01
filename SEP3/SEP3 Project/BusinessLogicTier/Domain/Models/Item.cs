namespace Domain.Models;

public class Item
{
    // TODO OwnerId, ContactFirstName, ContactLastName - Necessary?
    
    public string Name { get; init; }
    public int Id { get; init; }
    public string Description { get; init; }
    public int OwnerId { get; init; }
    public double Pricing { get; init; }
    public string Category { get; init; }
    public string Currency { get; init; }

    public bool IsSold { get; init; }
    //public byte[] Photos { get; set; }
    public string? ContactFirstName { get; init; }
    public string? ContactLastName { get; init; }
    public User? Owner { get; init; }
}