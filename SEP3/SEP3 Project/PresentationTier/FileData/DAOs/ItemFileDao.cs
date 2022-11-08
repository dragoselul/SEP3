using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace FileData.DAOs;

public class ItemFileDao : IItemDao
{
    private readonly FileContext context;

    public ItemFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<Item> CreateAsync(Item todo)
    {
        int id = 1;
        if (context.Items.Any())
        {
            id = context.Items.Max(t => t.Id);
            id++;
        }

        todo.Id = id;
        
        context.Items.Add(todo);
        context.SaveChanges();

        return Task.FromResult(todo);
    }

    public Task<IEnumerable<Item>> GetAsync(SearchItemParametersDto searchParams)
    {
        IEnumerable<Item> result = context.Items.AsEnumerable();

        if (!string.IsNullOrEmpty(searchParams.ContactFirstName) && !string.IsNullOrEmpty(searchParams.ContactLastName))
        {
            // we know username is unique, so just fetch the first
            result = context.Items.Where(item =>
                item.Contact.firstName.Equals(searchParams.ContactFirstName, StringComparison.OrdinalIgnoreCase) &&
                item.Contact.lastName.Equals(searchParams.ContactLastName, StringComparison.OrdinalIgnoreCase));
        }

        if (searchParams.ContactId != null)
        {
            result = result.Where(i => i.Contact.Id == searchParams.ContactId);
        }

        if (searchParams.Name != null)
        {
            result = result.Where(i => i.Name == searchParams.Name);
        }
        
        if (searchParams.Description != null)
        {
            result = result.Where(i => i.Description == searchParams.Description);
        }
        
        if (searchParams.Pricing != null)
        {
            result = result.Where(i => i.Pricing == searchParams.Pricing);
        }
        
        if (searchParams.IsSold != null)
        {
            result = result.Where(i => i.IsSold == searchParams.IsSold);
        }

        return Task.FromResult(result);
    }
}