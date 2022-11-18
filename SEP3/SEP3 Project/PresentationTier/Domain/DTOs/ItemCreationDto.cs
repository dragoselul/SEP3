using Domain.Models;

namespace Domain.DTOs;

public class ItemCreationDto
{
    public string Name { get; init; }
    public string Description { get; init; }
    public int ContactId { get; init; }
    public double Pricing { get; init; }
    
    public string Category { get; init; }
    public string Currency { get; init; }
    public bool IsSold { get; init; }
    // public byte[] Photos { get;}
    
}