namespace Domain.Models;

public class User
{
    public int Id { get; init; }
    public string firstName { get; init; }
    public string lastName { get; init; }
    public string email { get; init; }
    public string password { get; init; }
    public string phoneNumber { get; init; }
    public bool gender { get; init; }
    public DateTime dor { get; init; }

    public List<Item> ItemsList { get; init; }

    public int SecurityLevel { get; set; }

}