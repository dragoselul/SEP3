namespace Domain.DTOs;

public class ItemCreationDto
{
    public int Id { get;}
    
    public string Name { get; set; }
    public string Description { get;}
    public int ContactId { get;}
    public double Pricing { get;}
    // public byte[] Photos { get;}

    public ItemCreationDto(int id, string name, string description, int contactId, double pricing)
    {
        Id = id;
        Name = name;
        Description = description;
        ContactId = contactId;
        Pricing = pricing;
        //Photos = photos;
    }
}