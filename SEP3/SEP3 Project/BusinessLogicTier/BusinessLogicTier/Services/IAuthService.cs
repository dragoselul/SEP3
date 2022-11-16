using Domain.DTOs;
using Domain.Models;

namespace BusinessLogicTier.Services;

public interface IAuthService
{
    Task<User> ValidateUser(string email, string password);
    Task RegisterUser(UserCreationDto user);
}