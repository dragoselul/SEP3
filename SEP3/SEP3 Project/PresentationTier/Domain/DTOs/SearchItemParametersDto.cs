namespace Domain.DTOs;

public class SearchItemParametersDto
{
    public string? ContactFirstName { get; }
    public string? ContactLastName { get; }
    public string? Name { get; set; }
    public string? Description { get;}
    public int? ContactId { get;}
    public double? Pricing { get;}
    
    public bool? IsSold { get; } 
    // public byte[] Photos { get;}

    public SearchItemParametersDto(string contactFirstName, string contactLastName, string name, string description, int contactId, double pricing, bool isSold)
    {
        ContactFirstName = contactFirstName;
        ContactLastName = contactLastName;
        Name = name;
        Description = description;
        ContactId = contactId;
        Pricing = pricing;
        IsSold = isSold;
        //Photos = photos;
    }
}