

using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IUserService
{
    Task<User> Create(UserCreationDto dto);

    Task<User> Login(UserLoginDto dto);
    Task<IEnumerable<User>> GetUsers(string? firstName = null, string? lastName = null);
}