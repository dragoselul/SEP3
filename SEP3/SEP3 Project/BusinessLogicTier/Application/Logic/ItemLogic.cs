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

    public Task<List<Item>> GetAsync(SearchItemParametersDto searchParameters)
    {
        return itemDao.GetAsync(searchParameters);
    }

    public async Task UpdateAsync(ItemUpdateDto dto)
    {
        Item? existing = await itemDao.GetByIdAsync(dto.Id);

        if (existing == null)
        {
            throw new Exception($"Todo with ID {dto.Id} not found!");
        }

        User? user = null;
        if (dto.ContactId != null)
        {
            user = await userDao.GetByIdAsync((int)dto.ContactId);
            if (user == null)
            {
                throw new Exception($"User with id {dto.ContactId} was not found.");
            }
        }
        User? existingUser = await userDao.GetByIdAsync(existing.OwnerId);

        if (dto.IsSold != null && existing.IsSold && !(bool)dto.IsSold)
        {
            throw new Exception("Cannot un-complete a completed Todo");
        }

        User userToUse = user ?? existingUser;
        string firstNameToUse = dto.ContactFirstName ?? existing.ContactFirstName;
        string lastNameToUse = dto.ContactLastName ?? existing.ContactFirstName;
        string titleToUse = dto.Name ?? existing.Name;
        string descriptionToUse = dto.Description ?? existing.Description;
        double pricingToUse = dto.Pricing ?? existing.Pricing;
        bool soldToUse = dto.IsSold ?? existing.IsSold;
    
        Item updated = new()
        {
            Id = existing.Id,
            Name = titleToUse,
            Description = descriptionToUse,
            ContactFirstName = firstNameToUse,
            OwnerId = userToUse.Id,
            Pricing = pricingToUse,
            ContactLastName = lastNameToUse,
            IsSold = soldToUse
        };

        ValidateItem(updated);

        await itemDao.UpdateAsync(updated);
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
}