using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class UserLogic : IUserLogic
{
    public readonly IUserDao userDao;

    public UserLogic(IUserDao userDao)
    {
        this.userDao = userDao;
    }

    public async Task<User> CreateAsync(UserCreationDto dto)
    {
        User? existing = await userDao.GetByNameAsync(dto.FirstName);
        if (existing != null)
            throw new Exception("Username already taken!");

        ValidateData(dto);
        User toCreate = new User
        {
            firstName = dto.FirstName,
            lastName = dto.LastName,
            email = dto.Email,
            password = dto.Password,
            phoneNumber = dto.PhoneNumber,
            gender = dto.Gender,
        };
    
        User created = await userDao.CreateAsync(toCreate);
    
        return created;
    }
    
    private static void ValidateData(UserCreationDto userToCreate)
    {
        string password = userToCreate.Password;

        if (password.Length < 3)
            throw new Exception("Password must be at least 3 characters!");

        if (password.Length > 15)
            throw new Exception("Password must be less than 16 characters!");
    }
}