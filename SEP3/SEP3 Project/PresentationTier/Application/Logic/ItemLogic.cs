using Application.DaoInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace Application.Logic;

public class ItemLogic : IItemLogic
{
    
    private readonly IItemDao itemDao;
    private readonly IUserDao userDao;

    public ItemLogic(IItemDao itemDao, IUserDao userDao)
    {
        this.itemDao = itemDao;
        this.userDao = userDao;
    }
    
    public async Task<Item> CreateAsync(ItemCreationDto dto)
    {
        User? user = await userDao.GetByIdAsync(dto.ContactId);
        if (user == null)
        {
            throw new Exception($"Contact user with id {dto.ContactId} was not found.");
        }

        ValidateTodo(dto);
        Item todo = new Item(dto.Id, dto.Name, dto.Description, user, dto.Pricing);
        Item created = await itemDao.CreateAsync(todo);
        return created;
    }

    public Task<IEnumerable<Item>> GetAsync(SearchItemParametersDto searchParameters)
    {
        return itemDao.GetAsync(searchParameters);
    }

    private void ValidateTodo(ItemCreationDto dto)
    {
        if (string.IsNullOrEmpty(dto.Name)) throw new Exception("Title cannot be empty.");
        // other validation stuff
    }
}