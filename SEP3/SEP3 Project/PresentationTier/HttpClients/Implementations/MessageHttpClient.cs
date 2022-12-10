using System.Net.Http.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;
using Newtonsoft.Json;
using JsonSerializer = System.Text.Json.JsonSerializer;

namespace HttpClients.Implementations;

public class MessageHttpClient : IMessageService
{
    private readonly HttpClient Client;

    public MessageHttpClient(HttpClient client)
    {
        Client = client;
    }
    
    
    public async Task<Message?> Create(MessageCreationDto dto)
    {
        HttpResponseMessage response = await Client.PostAsJsonAsync("https://localhost:7171/Message", dto);
        Console.WriteLine(JsonSerializer.Serialize(dto));
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Message? item = JsonConvert.DeserializeObject<Message>(result);
        return await Task.FromResult(item);
    }

    public async Task<Message> GetById(int id)
    {
        HttpResponseMessage response = await Client.GetAsync($"/Message/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        Message? item = JsonConvert.DeserializeObject<Message>(result);
        return (await Task.FromResult(item))!;
    }

    public async Task<List<Message>> GetByConversationId(int conversationId)
    {
        HttpResponseMessage response = await Client.GetAsync($"/Message/conversationId={conversationId}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        List<Message>? item = JsonConvert.DeserializeObject<List<Message>>(result);
        return (await Task.FromResult(item))!;
    }

    public async Task Delete(int id)
    {
        HttpResponseMessage response = await Client.DeleteAsync($"/Message/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);
    }
}