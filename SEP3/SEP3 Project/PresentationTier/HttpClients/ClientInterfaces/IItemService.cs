using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IItemService
{
    Task<Item?> Create(ItemCreationDto dto);
    Task<Item> Update(ItemUpdateDto dto);
    Task<List<Item>> GetItemsByOwner(int userId);
    Task<List<Item>> GetItems(string? name, string? description, int? contactId, double? minPrice, double? maxPrice, bool? isSold, string? category);
    Task<List<Item>> GetAllItems();
    Task DeleteItemById(int id);
    Task<Item> GetItemById(int? id);
}