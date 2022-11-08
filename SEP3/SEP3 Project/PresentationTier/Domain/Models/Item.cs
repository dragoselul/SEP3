namespace Domain.Models;

public class Item
{
    public string Name { get; set; }
    public int Id { get; set; }
    public string Description { get; set; }
    public User Contact { get; set; }
    public double Pricing { get; set; }
    //public byte[] Photos { get; set; }

    public Item(int id, string name, string description, User contact, double pricing)
    {
        Id = id;
        Name = name;
        Description = description;
        Contact = contact;
        Pricing = pricing;
        //Photos = photos;
    }
}