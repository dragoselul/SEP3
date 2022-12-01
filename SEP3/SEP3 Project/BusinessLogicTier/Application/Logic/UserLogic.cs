using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class UserLogic : IUserLogic
{
    private readonly IUserDao userDao;

    public UserLogic(IUserDao userDao)
    {
        this.userDao = userDao;
    }

    public async Task<User> CreateAsync(UserCreationDto dto)
    {
        SearchUserParametersDto searchUserParametersDto = new()
        {
            FirstName = dto.FirstName,
            LastName = dto.LastName
        };
        List<User>? existing = await userDao.GetAsync(searchUserParametersDto);
        if (existing == null)
            throw new Exception("Username already taken!");
        
        User toCreate = new User
        {
            firstName = dto.FirstName,
            lastName = dto.LastName,
            email = dto.Email,
            password = dto.Password,
            phoneNumber = dto.PhoneNumber,
            gender = dto.Gender
        };
        
        User created = await userDao.CreateAsync(toCreate);
        
        return created;
    }

    public Task<User?> GetLoginAsync(UserLoginDto loginDto)
    {
        return userDao.GetLoginAsync(loginDto);
    }

    public async Task<List<User>> GetAsync(SearchUserParametersDto searchParameters)
    {
        return await userDao.GetAsync(searchParameters);
    }

    public async Task<User?> GetByIdAsync(int id)
    {
        return await userDao.GetByIdAsync(id);
    }

    public async Task<User?> UpdateUserAsync(UserUpdateDto updateDto)
    {
        return await userDao.UpdateUserAsync(updateDto);
    }

    public async Task DeleteByIdAsync(int id)
    {
        await userDao.DeleteUserById(id);
    }
}