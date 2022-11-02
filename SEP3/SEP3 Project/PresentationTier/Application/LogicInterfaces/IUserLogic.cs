using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IUserLogic
{
    Task<User> CreateAsync(UserCreationDto userToCreate);
}