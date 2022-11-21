using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IItemDao
{
    Task<Item> CreateAsync(Item post);
    
    Task<List<Item>> GetAsync(SearchItemParametersDto searchParameters);
    Task<List<Item>> GetAllItemsAsync();
    Task UpdateAsync(Item post);

    Task<Item> GetByIdAsync(int id);
    
    Task DeleteItemById(int id);
}