using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IItemLogic
{
    Task<Item> CreateAsync(ItemCreationDto dto);
    Task<List<Item>> GetAsync(SearchItemParametersDto searchParameters);
    Task<Item> GetByIdAsync(int id);
    Task<Item> UpdateAsync(ItemUpdateDto dto);
    Task DeleteByIdAsync(int id);
}