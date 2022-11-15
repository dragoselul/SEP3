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
        Item todo = new Item(dto.Name, dto.Description, user, dto.Pricing);
        Item created = await itemDao.CreateAsync(todo);
        return created;
    }

    public Task<IEnumerable<Item>> GetAsync(SearchItemParametersDto searchParameters)
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

        if (dto.IsSold != null && existing.IsSold && !(bool)dto.IsSold)
        {
            throw new Exception("Cannot un-complete a completed Todo");
        }

        User userToUse = user ?? existing.Contact;
        string firstNameToUse = dto.ContactFirstName ?? existing.ContactFirstName;
        string lastNameToUse = dto.ContactLastName ?? existing.ContactFirstName;
        string titleToUse = dto.Name ?? existing.Name;
        string descriptionToUse = dto.Description ?? existing.Description;
        double pricingToUse = dto.Pricing ?? existing.Pricing;
        bool soldToUse = dto.IsSold ?? existing.IsSold;
    
        Item updated = new (titleToUse, descriptionToUse, userToUse, pricingToUse)
        {
            Id = existing.Id,
            Name = titleToUse,
            Description = descriptionToUse,
            ContactFirstName = firstNameToUse,
            Contact = userToUse,
            Pricing = pricingToUse,
            ContactLastName = lastNameToUse,
            IsSold = soldToUse
            
        };

        ValidateTodo(updated);

        await itemDao.UpdateAsync(updated);
    }

    private void ValidateTodo(Item dto)
    {
        if (string.IsNullOrEmpty(dto.Name)) throw new Exception("Title cannot be empty.");
        // other validation stuff
    }
    
    private void ValidateTodo(ItemCreationDto dto)
    {
        if (string.IsNullOrEmpty(dto.Name)) throw new Exception("Title cannot be empty.");
        // other validation stuff
    }
}