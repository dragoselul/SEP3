using System.Net.Http.Json;
using System.Security.AccessControl;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;
using Newtonsoft.Json;

namespace HttpClients.Implementations;

public class ItemHttpClient: IItemService
{
    private readonly HttpClient Client;

    public ItemHttpClient(HttpClient client)
    {
        Client = client;
    }

    public async Task<Item?> Create(ItemCreationDto dto)
    {
        HttpResponseMessage response = await Client.PostAsJsonAsync("https://localhost:7171/Item", dto);
        Console.WriteLine(dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Item? item = JsonConvert.DeserializeObject<Item>(result);
        return await Task.FromResult(item);
    }

    public Task<Item> Update(ItemUpdateDto dto)
    {
        throw new NotImplementedException();
    }

    public async Task<List<Item>> GetItemsByOwner(User user)
    {
        HttpResponseMessage response = await Client.GetAsync($"/Item?contactId={user.Id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        List<Item>? items = JsonConvert.DeserializeObject<List<Item>>(result);
        return (await Task.FromResult(items))!;
    }

    public async Task<List<Item>> GetItems()
    {
        HttpResponseMessage response = await Client.GetAsync("/Item");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        List<Item>? items = JsonConvert.DeserializeObject<List<Item>>(result);
        return (await Task.FromResult(items))!;
    }

    public Task DeleteItemById(int id)
    {
        throw new NotImplementedException();
    }

    public async Task<Item> GetItemById(int id)
    {
        HttpResponseMessage response = await Client.GetAsync($"/Item/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        Item? item = JsonConvert.DeserializeObject<Item>(result);
        return (await Task.FromResult(item))!;
    }
}