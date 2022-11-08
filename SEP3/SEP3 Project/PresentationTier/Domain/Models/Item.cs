namespace Domain.Models;

public class Item
{
    public string Name { get; set; }
    public int Id { get; set; }
    public string Description { get; set; }
    public User Contact { get; set; }
    public double Pricing { get; set; }
    
    public bool IsSold { get; set; }
    //public byte[] Photos { get; set; }
    
    public string? ContactFirstName { get; set; }
    public string? ContactLastName { get; set; }

    public Item(string name, string description, User contact, double pricing)
    {
        Name = name;
        Description = description;
        Contact = contact;
        Pricing = pricing;
        //Photos = photos;
    }
}