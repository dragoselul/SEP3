using System.Net.Http.Json;
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
        HttpResponseMessage response = await Client.PostAsJsonAsync("/Item", dto);
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

    public Task<List<Item>> GetItems()
    {
        throw new NotImplementedException();
    }

    public Task DeleteItemById(int id)
    {
        throw new NotImplementedException();
    }

    public Task<Item> GetItemById(int id)
    {
        throw new NotImplementedException();
    }
}