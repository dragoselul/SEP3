using System.ComponentModel.DataAnnotations;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.WebUtilities;
using Newtonsoft.Json;

namespace BusinessLogicTier.Services.Http;

public class AuthService : IAuthService
{
    private readonly HttpClient Client = new();
    public async Task<User> ValidateUser(string email, string password)
    {
        
        var query = new Dictionary<string, string>()
        {
            ["email"] = email
        };
        var uri = QueryHelpers.AddQueryString("https://localhost:7171/users", query);
        HttpResponseMessage response = await Client.GetAsync(uri);
        string content = response.Content.ReadAsStringAsync().Result;
        List<User>? users = JsonConvert.DeserializeObject<List<User>>(content);
        User? user = users[0];
        if (user is null)
        {
            throw new Exception("Email not found");
        }

        if (!user.password.Equals(password))
        {
            throw new Exception("Password mismatch");
        }

        return await Task.FromResult(user);
    }

    public async Task RegisterUser(UserCreationDto user)
    {
        var query = new Dictionary<string, string>()
        {
            ["email"] = user.Email
        };
        var uri = QueryHelpers.AddQueryString("https://localhost:7130/Users", query);
        HttpResponseMessage response = await Client.GetAsync(uri);
        string content = response.Content.ReadAsStringAsync().Result;
        List<User>? users = JsonConvert.DeserializeObject<List<User>>(content);
        if (users.Count > 0)
        {
            throw new Exception("Email already exists");
        }
        if (string.IsNullOrEmpty(user.Email))
        {
            throw new Exception("Email cannot be null");
        }

        if (string.IsNullOrEmpty(user.Password))
        {
            throw new Exception("Password cannot be null");
        }
        
        await Client.PostAsJsonAsync("https://localhost:7171/users", user);
    }
}
