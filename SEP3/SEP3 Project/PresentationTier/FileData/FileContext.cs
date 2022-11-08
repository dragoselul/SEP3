using System.Text.Json;
using Domain.Models;

namespace FileData;

public class FileContext
{
    private const string filePath = "data.json";
    private DataContainer? dataContainer;

    public ICollection<Item> Items
    {
        get
        {
            LoadData();
            return dataContainer!.Items;
        }
    }

    public ICollection<User> Users
    {
        get
        {
            LoadData();
            return dataContainer!.Users;
        }
    }

    public void LoadData()
    {
        if (dataContainer != null) return;

        if (!File.Exists(filePath))
        {
            dataContainer = new()
            {
                Items = new List<Item>(),
                Users = new List<User>()
            };
            return;
        }

        string content = File.ReadAllText(filePath);
        dataContainer = JsonSerializer.Deserialize<DataContainer>(content);
    }
    public void SaveChanges()
    {
        string serialized = JsonSerializer.Serialize(dataContainer);
        File.WriteAllText(filePath, serialized);
        dataContainer = null;
    }
    
}