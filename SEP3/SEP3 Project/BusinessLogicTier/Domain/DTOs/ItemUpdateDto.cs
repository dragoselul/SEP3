namespace Domain.DTOs;

public class ItemUpdateDto
{
    
    public int Id { get; }
    public string? ContactFirstName { get; }
    public string? ContactLastName { get; }
    public string? Name { get; set; }
    public string? Description { get;}
    public int? ContactId { get;}
    public double? Pricing { get;}
    
    public bool? IsSold { get; } 
    // public byte[] Photos { get;}

    public ItemUpdateDto(int id)
    {
        Id = id;
    }
}