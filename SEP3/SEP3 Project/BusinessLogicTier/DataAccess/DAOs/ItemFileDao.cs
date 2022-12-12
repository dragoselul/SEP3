using System.Text.Json;
using Application.DaoInterfaces;
using DataAccess.ProtoConverters;
using Domain.DTOs;
using Grpc.Core;
using Grpc.Net.Client;
using gRPCClient;
using Item = Domain.Models.Item;

namespace DataAccess.DAOs;

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
        string Name = "";
        string Description = "";
        int ContactId = 0;
        double MinPrice = double.MinValue;
        double MaxPrice = double.MaxValue;
        bool IsSold = false;
        string Category = "";

        if (!string.IsNullOrEmpty(searchParams.Name))
        {
            Name = searchParams.Name;
        }
        if (!string.IsNullOrEmpty(searchParams.Description))
        {
            Description = searchParams.Description;
        }
        if (!string.IsNullOrEmpty(searchParams.Category))
        {
            Category = searchParams.Category;
        }
        if (searchParams.ContactId is not null or 0)
        {
            ContactId = (int)searchParams.ContactId;
        }
        if (searchParams.MinPrice is not null or 0)
        {
            MinPrice = (double)searchParams.MinPrice;
        }
        if (searchParams.MaxPrice is not null or 0)
        {
            MaxPrice = (double)searchParams.MaxPrice;
        }
        if (searchParams.IsSold is not null)
        {
            IsSold = (bool)searchParams.IsSold;
        }
        List<Item> items = new();
        SearchItemDTO searchItemDto = new();
        searchItemDto.Id = 0;
        searchItemDto.Name = Name;
        searchItemDto.Description = Description;
        searchItemDto.Category = Category;
        searchItemDto.OwnerId = ContactId;
        searchItemDto.Status = IsSold;
        searchItemDto.MaxPrice = MaxPrice;
        searchItemDto.MinPrice = MinPrice;
        AsyncServerStreamingCall<gRPCClient.Item> call = ClientItem.getItems(searchItemDto);
        await foreach (var response in call.ResponseStream.ReadAllAsync())
        {
            Item? item = new()
            {
                Id = (int)response.Id,
                Category = response.Category,
                ContactFirstName = response.Owner.FirstName,
                ContactLastName = response.Owner.LastName,
                Currency = response.Currency,
                Description = response.Description,
                IsSold = response.Status,
                Name = response.Name,
                OwnerId = (int)response.Owner.Id,
                Pricing = response.Price
            };
            items.Add(item);
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
                MaxPrice = Double.MaxValue,
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

    public async Task<Item> UpdateAsync(Item toUpdate)
    {
        
        Console.WriteLine(JsonSerializer.Serialize(toUpdate));

        gRPCClient.Item ToUpdate = await ClientItem.updateItemAsync(new UpdateItemDTO()
        {
            Name = toUpdate.Name,
            Category = toUpdate.Category,
            Price = toUpdate.Pricing,
            Currency = toUpdate.Currency,
            Description = toUpdate.Description,
            Status = toUpdate.IsSold,
            Id = toUpdate.Id,
            OwnerId = toUpdate.OwnerId
        });
       
        Console.WriteLine(JsonSerializer.Serialize(ToUpdate.Owner));
        
        Item Updated = new()
        {
            Id = (int)ToUpdate.Id,
            Name = ToUpdate.Name,
            Category = ToUpdate.Category,
            ContactFirstName = ToUpdate.Owner.FirstName,
            ContactLastName = ToUpdate.Owner.LastName,
            Currency = ToUpdate.Currency,
            Description = ToUpdate.Description,
            IsSold = ToUpdate.Status,
            OwnerId = (int)ToUpdate.Owner.Id,
            Pricing = ToUpdate.Price,
            Owner = ClassConverter.ConvertProtoToDomain(ToUpdate.Owner)
        };
        return await Task.FromResult(Updated);
    }

    public async Task DeleteItemById(int id)
    {
        await ClientItem.deleteItemAsync(new SearchItemDTO
        {
            Id = id,
            OwnerId = 0,
            Name = "",
            Description = "",
            MinPrice = 0,
            MaxPrice = 0,
            Status = true
        });
    }
}