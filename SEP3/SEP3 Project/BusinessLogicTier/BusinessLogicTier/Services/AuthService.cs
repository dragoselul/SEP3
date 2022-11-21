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
            ["email"] = email,
            ["password"] = password
        };
        var uri = QueryHelpers.AddQueryString("https://localhost:7171/Users/Login", query);
        HttpResponseMessage response = await Client.GetAsync(uri);
        string content = response.Content.ReadAsStringAsync().Result;
        User? user = JsonConvert.DeserializeObject<User>(content);
        Console.WriteLine(user.password);
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
            ["firstName"] = user.FirstName,
            ["lastName"] = user.LastName,
            ["password"] = user.Password,
            ["email"] = user.Email,
            ["phoneNumber"] = user.PhoneNumber,
            ["gender"] = user.Gender.ToString()
        };
        var uri = QueryHelpers.AddQueryString("https://localhost:7171/Users", query);
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
        await Client.PostAsJsonAsync("https://localhost:7171/Users", user);
    }
}
