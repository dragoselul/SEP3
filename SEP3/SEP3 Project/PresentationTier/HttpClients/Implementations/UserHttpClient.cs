using System.Net.Http.Json;
using System.Security.Cryptography;
using System.Text;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;


namespace HttpClients.Implementations;

public class UserHttpClient : IUserService
{
    private readonly HttpClient client;

    public UserHttpClient(HttpClient client)
    {
        this.client = client;
    }

    public async Task<User> Create(UserCreationDto dto)
    {
        using (SHA256 mySHA256 = SHA256.Create())
        {
            byte[] bytes = mySHA256.ComputeHash(Encoding.UTF8.GetBytes(dto.Password));  
  
            // Convert byte array to a string   
            StringBuilder builder = new StringBuilder();  
            for (int i = 0; i < bytes.Length; i++)  
            {  
                builder.Append(bytes[i].ToString("x2"));  
            }

            dto.Password = builder.ToString();
        }
        HttpResponseMessage response = await client.PostAsJsonAsync("/Auth/register", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User user = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return user;
    }

    public async Task<User> Login(UserLoginDto dto)
    {
        using (SHA256 mySHA256 = SHA256.Create())
        {
            byte[] bytes = mySHA256.ComputeHash(Encoding.UTF8.GetBytes(dto.Password));  
  
            // Convert byte array to a string   
            StringBuilder builder = new StringBuilder();  
            for (int i = 0; i < bytes.Length; i++)  
            {  
                builder.Append(bytes[i].ToString("x2"));  
            }

            dto.Password = builder.ToString();
        }
        HttpResponseMessage response = await client.PostAsJsonAsync("/Auth/login", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User user = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return user;
    }

    public async Task<IEnumerable<User>> GetUsers(string? firstName = null, string? lastName = null)
    {
       string query = "https://localhost:7171/Users";
        if (!string.IsNullOrEmpty(firstName))
        {
            query += $"?firstname={firstName}";
        }

        if (!string.IsNullOrEmpty(lastName))
        {
            query += string.IsNullOrEmpty(query) ? "?" : "&";
            query += $"lastname={lastName}";
        }
        HttpResponseMessage response = await client.GetAsync(query);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        IEnumerable<User> users = JsonSerializer.Deserialize<IEnumerable<User>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return users;
    }

    public async Task<User> GetUserById(int id)
    {
        HttpResponseMessage response = await client.GetAsync($"Users/{id}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User user = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return user;
    }

    public async Task<User> UpdateUserAsync(UserUpdateDto dto)
    {
        using (SHA256 mySHA256 = SHA256.Create())
        {
            byte[] bytes = mySHA256.ComputeHash(Encoding.UTF8.GetBytes(dto.Password));  
  
            // Convert byte array to a string   
            StringBuilder builder = new StringBuilder();  
            for (int i = 0; i < bytes.Length; i++)  
            {  
                builder.Append(bytes[i].ToString("x2"));  
            }

            dto.Password = builder.ToString();
        }
        string dtoAsJson = JsonSerializer.Serialize(dto);
        StringContent body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");
        HttpResponseMessage response = await client.PatchAsync("Users", body);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User user = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return user;
    }

    public async Task DeleteUserById(int userId)
    {
        HttpResponseMessage response = await client.DeleteAsync($"Users/{userId}");
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        await Task.CompletedTask;
    }
}