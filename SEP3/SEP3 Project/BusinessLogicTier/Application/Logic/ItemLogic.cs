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
        Console.Out.WriteLine(user?.email);
        if (user == null)
        {
            throw new Exception($"Contact user with id {dto.ContactId} was not found.");
        }

        ValidateItem(dto);
        Item item = new()
        {
            Name = dto.Name,
            Description = dto.Description,
            OwnerId = dto.ContactId,
            Pricing = dto.Pricing,
            Category = dto.Category,
            Currency = dto.Currency,
            IsSold = dto.IsSold
        };
        Item created = await itemDao.CreateAsync(item);
        return created;
    }

    public async Task<List<Item>> GetAsync(SearchItemParametersDto searchParameters)
    {
        return await itemDao.GetAsync(searchParameters);
    }

    public async Task<Item> GetByIdAsync(int id)
    {
        return await itemDao.GetByIdAsync(id);
    }

    public async Task<Item> UpdateAsync(ItemUpdateDto dto)
    {
        Item? existing = await itemDao.GetByIdAsync(dto.Id);
        Item updated = new()
        {
            Id = existing.Id,
            Name = dto.Name ?? existing.Name,
            Description = dto.Description ?? existing.Description,
            OwnerId = existing.OwnerId,
            Pricing = dto.Pricing ?? existing.Pricing,
            IsSold = dto.IsSold ?? existing.IsSold,
            Currency = dto.Currency ?? existing.Currency,
            Category = dto.Category ?? existing.Category,
            
        };

        ValidateItem(updated);
        return await itemDao.UpdateAsync(updated);
    }

    private void ValidateItem(Item dto)
    {
        if (string.IsNullOrEmpty(dto.Name)) throw new Exception("Title cannot be empty.");
        // other validation stuff
    }

    private void ValidateItem(ItemCreationDto dto)
    {
        if (string.IsNullOrEmpty(dto.Name)) throw new Exception("Title cannot be empty.");
        // other validation stuff
    }

    public async Task DeleteByIdAsync(int id)
    {
        await itemDao.DeleteItemById(id);
    }
}