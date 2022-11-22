using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IItemService
{
    Task<Item?> Create(ItemCreationDto dto);
    Task<Item> Update(ItemUpdateDto dto);
    Task<List<Item>> GetItems();
    Task DeleteItemById(int id);
    Task<Item> GetItemById(int id);
}