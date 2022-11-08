using Domain.DTOs;
using Domain.Models;

namespace Application.DaoInterfaces;

public interface IItemDao
{
    Task<Item> CreateAsync(Item todo);
    
    Task<IEnumerable<Item>> GetAsync(SearchItemParametersDto searchParameters);
    
    Task UpdateAsync(Item todo);

    Task<Item> GetByIdAsync(int id);
}