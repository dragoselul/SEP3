using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
    public Task<User> CreateAsync(UserCreationDto dto);
    public Task<List<User>> GetAsync(SearchUserParametersDto searchParameters);
    public Task<User?> GetLoginAsync(UserLoginDto loginDto);

    public Task<User?> GetById(int id);
}