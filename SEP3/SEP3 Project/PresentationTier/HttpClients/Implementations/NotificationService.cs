using Domain.Models;
using HttpClients.ClientInterfaces;
using Newtonsoft.Json;

public class NotificationService : INotificationService
{
    
    private readonly HttpClient Client;

    public NotificationService(HttpClient client)
    {
        Client = client;
    }

    public async Task<List<Notification>> GetNotificationsByUserId(int id)
    {
        HttpResponseMessage response = await Client.GetAsync($"/notification/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        List<Notification>? notifications = JsonConvert.DeserializeObject<List<Notification>>(result);
        return (await Task.FromResult(notifications))!;
    }

    public async void DeleteNotificationById(int id)
    {
        HttpResponseMessage response = await Client.DeleteAsync($"/notification/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);
    }

    public async void DeleteNotificationsByUserId(int id)
    {
        HttpResponseMessage response = await Client.GetAsync($"/notification?userId={id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);
    }
}