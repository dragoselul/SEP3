using Application.DaoInterfaces;
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
}