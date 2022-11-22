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
        
        gRPCClient.Item created = await ClientItem.createItemAsync(new CreateItemDTO
        {
            OwnerId = item.OwnerId,
            Category = item.Category,
            Currency = item.Currency,
            Description = item.Description,
            Name = item.Name,
            Price = item.Pricing,
            Status = item.IsSold
        });

        Item newItem = new Item()
        {
            Id = (int)created.Id,
            Category = created.Category,
            ContactFirstName = created.Owner.FirstName,
            ContactLastName = created.Owner.LastName,
            Currency = created.Currency,
            Description = created.Description,
            IsSold = created.Status,
            Name = created.Name,
            OwnerId = (int)created.Owner.Id,
            Pricing = created.Price
        };

        return await Task.FromResult(newItem);
    }

    public async Task<List<Item>> GetAllItemsAsync()
    {
        List<Item> items = new();
        try
        {
            while (true)
            {
                gRPCClient.Item? item = ClientItem.getItems(new SearchItemDTO() { Name = "", Id = 0}).ResponseStream.Current;
                Item? toSend = new()
                {
                    Id = (int)item.Id,
                    Category = item.Category,
                    Pricing = item.Price,
                    OwnerId = (int)item.Owner.Id,
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
                gRPCClient.Item? item = ClientItem.getItems(new SearchItemDTO()
                    {
                        Id = 0,
                        OwnerId = (long)searchParams.ContactId,
                        Name = searchParams.Name,
                        Description = searchParams.Description,
                        MinPrice = (double)searchParams.MinPrice,
                        MaxPrice = (double)searchParams.MaxPrice,
                        Status = (bool)searchParams.IsSold
                    })
                    .ResponseStream.Current;
                Item? toSend = new()
                {
                    Id = (int)item.Id,
                    Category = item.Category,
                    Pricing = item.Price,
                    OwnerId = (int)item.Owner.Id,
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
        gRPCClient.Item? item  = ClientItem.getItemByIdAsync(new SearchItemDTO
            {
                Id = id,
                OwnerId = 0,
                Name = "",
                Description = "",
                MinPrice = 0,
                MaxPrice = 1000000,
                Status = false
            })
            .ResponseAsync.Result;
        Item? toSend = new()
        {
            Id = (int)item.Id,
            Category = item.Category,
            Pricing = item.Price,
            OwnerId = (int)item.Owner.Id,
            Currency = item.Currency,
            Description = item.Description,
            IsSold = item.Status,
            Name = item.Name
        };
        return await Task.FromResult(toSend);
    }

    public async Task UpdateAsync(Item toUpdate)
    {
        gRPCClient.Item? item = ClientItem.getItemByIdAsync(new SearchItemDTO { 
                Id = toUpdate.Id,
                OwnerId = toUpdate.OwnerId,
                Name = toUpdate.Name,
                Description = toUpdate.Description,
                MinPrice = toUpdate.Pricing,
                MaxPrice = toUpdate.Pricing,
                Status = toUpdate.IsSold
                
            })
            .ResponseAsync.Result;
        if (item == null)
        {
            throw new Exception($"Item with id {toUpdate.Id} does not exist!");
        }

        await ClientItem.updateItemAsync(new UpdateItemDTO()
        {
            Name = toUpdate.Name,
            Category = toUpdate.Category,
            Price = toUpdate.Pricing,
            Currency = toUpdate.Currency,
            Description = toUpdate.Description,
            Status = toUpdate.IsSold
        });
    }

    public Task DeleteItemById(int id)
    {
        throw new NotImplementedException();
    }
}