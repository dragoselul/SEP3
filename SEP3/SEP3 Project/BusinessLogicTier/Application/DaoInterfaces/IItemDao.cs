using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IItemDao
{
    Task<Item> CreateAsync(Item todo);
    
    Task<List<Item>> GetAsync(SearchItemParametersDto searchParameters);
    Task<List<Item>> GetAllItemsAsync();
    Task UpdateAsync(Item todo);

    Task<Item> GetByIdAsync(int id);
}