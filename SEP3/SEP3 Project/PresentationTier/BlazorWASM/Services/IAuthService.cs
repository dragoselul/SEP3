using System.Security.Claims;
using Domain.DTOs;

namespace BlazorWasm.Services;

public interface IAuthService
{
    public Task LoginAsync(string email, string password);
    public Task LogoutAsync();
    public Task RegisterAsync(UserCreationDto userToRegister);
    public Task<ClaimsPrincipal> GetAuthAsync();

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
}