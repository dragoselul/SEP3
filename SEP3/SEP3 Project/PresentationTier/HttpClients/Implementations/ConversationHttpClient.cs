using System.Net.Http.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;
using Newtonsoft.Json;

namespace HttpClients.Implementations;

public class ConversationHttpClient : IConversationService
{
    
    private readonly HttpClient Client;

    public ConversationHttpClient(HttpClient client)
    {
        Client = client;
    }
    
    public async Task<Conversation?> Create(ConversationCreationDto dto)
    {
        HttpResponseMessage response = await Client.PostAsJsonAsync("https://localhost:7171/Conversation", dto);
        Console.WriteLine(dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Conversation? item = JsonConvert.DeserializeObject<Conversation>(result);
        return await Task.FromResult(item);
    }

    public async Task<Conversation> GetById(int id)
    {
        HttpResponseMessage response = await Client.GetAsync($"/Conversation/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        Conversation? item = JsonConvert.DeserializeObject<Conversation>(result);
        return (await Task.FromResult(item))!;
    }

    public async Task<List<Conversation>> GetByUserId(int userId)
    {
        
        Console.WriteLine("Receive data");
        HttpResponseMessage response = await Client.GetAsync($"/Conversation?userId={userId}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        List<Conversation>? item = JsonConvert.DeserializeObject<List<Conversation>>(result);
        return (await Task.FromResult(item))!;
    }

    public async Task Delete(int id)
    {
        HttpResponseMessage response = await Client.DeleteAsync($"/Conversation/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);
    }
}