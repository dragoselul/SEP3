using System.Net.Http.Json;
using System.Text;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;
using Newtonsoft.Json;
using JsonSerializer = System.Text.Json.JsonSerializer;

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
    
    public async Task<Item> Update(ItemUpdateDto dto)
    {
        string dtoAsJson = JsonSerializer.Serialize(dto);
        Console.WriteLine(dtoAsJson);
        
        StringContent body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = null;
        try
        {
            response = await Client.PatchAsync($"/Item/{dto.Id}", body);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
        
        
        var result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            Console.WriteLine(response);
           // throw new Exception(result);
        }
        Console.WriteLine(result);
        Item? item = JsonConvert.DeserializeObject<Item>(result);
        return (await Task.FromResult(item))!;
    }

    public async Task<List<Item>> GetItemsByOwner(int userId)
    {
        HttpResponseMessage response = await Client.GetAsync($"/Item?contactId={userId}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        List<Item>? items = JsonConvert.DeserializeObject<List<Item>>(result);
        return (await Task.FromResult(items))!;
    }

    public async Task<List<Item>> GetItems(string? name, string? description, int? contactId, double? minPrice, double? maxPrice, bool? isSold, string? category)
    {
        string query = "";
        if (!string.IsNullOrEmpty(name))
        {
            query += $"/Item?name={name}";
        }
        if (!string.IsNullOrEmpty(description))
        {
            query += string.IsNullOrEmpty(query) ? "/Item?" : "&";
            query += $"description={description}";
        }
        if (contactId is not null and not 0)
        {
            query += string.IsNullOrEmpty(query) ? "/Item?" : "&";
            query += $"contactId={contactId}";
        }
        if (minPrice is not null and not 0)
        {
            query += string.IsNullOrEmpty(query) ? "/Item?" : "&";
            query += $"minPrice={minPrice}";
        }
        if (maxPrice is not null and not 0)
        {
            query += string.IsNullOrEmpty(query) ? "/Item?" : "&";
            query += $"maxPrice={maxPrice}";
        }
        if (!string.IsNullOrEmpty(category))
        {
            query += string.IsNullOrEmpty(query) ? "/Item?" : "&";
            query += $"category={category}";
        }
        query += string.IsNullOrEmpty(query) ? "/Item?" : "&";
        query += $"isSold={isSold}";
        HttpResponseMessage response = await Client.GetAsync(query);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        List<Item>? items = JsonConvert.DeserializeObject<List<Item>>(result);
        return (await Task.FromResult(items))!;
    }
    
    public async Task<List<Item>> GetAllItems()
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

    public async Task DeleteItemById(int id)
    {
        HttpResponseMessage response = await Client.DeleteAsync($"/Item/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);
    }

    public async Task<Item> GetItemById(int? id)
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