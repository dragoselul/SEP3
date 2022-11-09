using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IUserDao
{
    Task<User> CreateAsync(User user);
   // Task<User?> GetByNameAsync(string firstName, string lastName);
    Task<List<User>> GetAsync(SearchUserParametersDto searchParameters);
    Task<User?> GetByIdAsync(int dtoContactId);
}