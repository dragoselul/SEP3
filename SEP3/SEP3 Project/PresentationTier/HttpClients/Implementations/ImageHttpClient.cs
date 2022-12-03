using System.Net.Http.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;
using Newtonsoft.Json;

namespace HttpClients.Implementations;

public class ImageHttpClient :IImageService
{
    
    private readonly HttpClient Client;

    public ImageHttpClient(HttpClient client)
    {
        Client = client;
    }
    
    
    public async Task<Image?> UploadImage(ImageCreationDto dto)
    {
        HttpResponseMessage response = await Client.PostAsJsonAsync("https://localhost:7171/Image", dto);
        Console.WriteLine(dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Image? image = JsonConvert.DeserializeObject<Image>(result);
        return await Task.FromResult(image);
    }

    public async Task<List<Image>> GetImagesByItemId(int id)
    {
        HttpResponseMessage response = await Client.GetAsync($"/Item/images/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        List<Image>? images = JsonConvert.DeserializeObject<List<Image>>(result);
        return (await Task.FromResult(images))!;
    }

    public async Task<Image> GetImageById(int id)
    {
        HttpResponseMessage response = await Client.GetAsync($"/Image/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);

        Image? image = JsonConvert.DeserializeObject<Image>(result);
        return (await Task.FromResult(image))!;
    }

    public async Task DeleteImageById(int id)
    {
        HttpResponseMessage response = await Client.DeleteAsync($"/Image/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        Console.WriteLine(result);
    }
}