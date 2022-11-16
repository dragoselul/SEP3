using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;
using Grpc.Net.Client;
using gRPCClient;
using Item = Domain.Models.Item;

namespace FileData.DAOs;

public class ItemFileDao : IItemDao
{
    private readonly GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");

    private ItemService.ItemServiceClient? ClientItem;

    public ItemFileDao()
    {
        ClientItem = new(channel);
    }

    public async Task<Item> CreateAsync(Item item)
    {
        await ClientItem.createItemAsync(new CreateItemDTO
        {
            Category = item.Category,
            Currency = item.Currency,
            Description = item.Description,
            Name = item.Name,
            Price = item.Pricing,
            Status = item.IsSold.ToString()
        });
        return await Task.FromResult(item);
    }

    public async Task<List<Item>> GetAllItemsAsync()
    {
        List<Item> items = new();
        try
        {
            while (true)
            {
                gRPCClient.Item? item = ClientItem.getItemAsync(new SearchItemDTO() { Name = "", Id = 0})
                    .ResponseAsync.Result;
                Item? toSend = new()
                {
                    Id = (int)item.Id,
                    Category = item.Category,
                    Pricing = item.Price,
                    OwnerId = (int)item.OwnerId,
                    Currency = item.Currency,
                    Description = item.Description,
                    IsSold = item.Status,
                    Name = item.Name
                };
                items.Add(toSend);
            }
        }
        catch (Exception e)
        {
            Console.WriteLine("We got all the items");
        }
        
        return await Task.FromResult(items);
    }

    public async Task<List<Item>> GetAsync(SearchItemParametersDto searchParams)
    {
        List<Item> items = new();
        try
        {
            while (true)
            {
                gRPCClient.Item? item = ClientItem.getItemAsync(new SearchItemDTO() { Id = 0, OwnerId = (long)searchParams.ContactId, Name = searchParams.Name, Description = searchParams.Description, Price = (double)searchParams.Pricing ,Status = (bool)searchParams.IsSold})
                    .ResponseAsync.Result;
                Item? toSend = new()
                {
                    Id = (int)item.Id,
                    Category = item.Category,
                    Pricing = item.Price,
                    OwnerId = (int)item.OwnerId,
                    Currency = item.Currency,
                    Description = item.Description,
                    IsSold = item.Status,
                    Name = item.Name
                };
                items.Add(toSend);
            }
        }
        catch (Exception e)
        {
            Console.WriteLine("We got all the items");
        }
        return await Task.FromResult(items);
    }
    
    public async Task<Item> GetByIdAsync(int id)
    {
        gRPCClient.Item? item  = ClientItem.getItemAsync(new SearchItemDTO { Id = id, OwnerId = 0, Name = "", Description = "", Price = 0 ,Status = false})
            .ResponseAsync.Result;
        Item? toSend = new()
        {
            Id = (int)item.Id,
            Category = item.Category,
            Pricing = item.Price,
            OwnerId = (int)item.OwnerId,
            Currency = item.Currency,
            Description = item.Description,
            IsSold = item.Status,
            Name = item.Name
        };
        return await Task.FromResult(toSend);
    }

    public async Task UpdateAsync(Item toUpdate)
    {
        gRPCClient.Item? item = ClientItem.getItemAsync(new SearchItemDTO { Id = toUpdate.Id, OwnerId = toUpdate.OwnerId, Name = toUpdate.Name, Description = toUpdate.Description, Price = toUpdate.Pricing ,Status = toUpdate.IsSold})
            .ResponseAsync.Result;
        if (item == null)
        {
            throw new Exception($"Item with id {toUpdate.Id} does not exist!");
        }

        await ClientItem.updateItemAsync(new CreateItemDTO()
        {
            Name = toUpdate.Name,
            Category = toUpdate.Category,
            Price = toUpdate.Pricing,
            Currency = toUpdate.Currency,
            Description = toUpdate.Description,
            Status = toUpdate.IsSold.ToString()
        });
    }

    
}