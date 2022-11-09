using Application.DaoInterfaces;
using Domain.DTOs;
using Domain.Models;
using Grpc.Net.Client;
using gRPCClient;

namespace FileData.DAOs;

public class ItemFileDao : IItemDao
{
    private readonly GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");

    private ProductService.ProductServiceClient? ClientItem;

    public ItemFileDao()
    {
        ClientItem = new(channel);
    }

    public async Task<Item> CreateAsync(Item item)
    {
        await ClientItem.createProductAsync(new CreateProductDTO
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
                Product? product = ClientItem.getProductAsync(new SearchProductDTO { Name = "", Id = 0})
                    .ResponseAsync.Result;
                Item? item = new()
                {
                    Id = (int)product.Id,
                    Category = product.Category,
                    Pricing = product.Price,
                    OwnerId = (int)product.OwnerId,
                    Currency = product.Currency,
                    Description = product.Description,
                    IsSold = product.Status,
                    Name = product.Name
                };
                items.Add(item);
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
                Product? product = ClientItem.getProductAsync(new SearchProductDTO { Id = 0, OwnerId = (long)searchParams.ContactId, Name = searchParams.Name, Description = searchParams.Description, Price = (double)searchParams.Pricing ,Status = (bool)searchParams.IsSold})
                    .ResponseAsync.Result;
                Item? item = new()
                {
                    Id = (int)product.Id,
                    Category = product.Category,
                    Pricing = product.Price,
                    OwnerId = (int)product.OwnerId,
                    Currency = product.Currency,
                    Description = product.Description,
                    IsSold = product.Status,
                    Name = product.Name
                };
                items.Add(item);
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
        Product? product = ClientItem.getProductAsync(new SearchProductDTO { Id = id, OwnerId = 0, Name = "", Description = "", Price = 0 ,Status = false})
            .ResponseAsync.Result;
        Item? item = new()
        {
            Id = (int)product.Id,
            Category = product.Category,
            Pricing = product.Price,
            OwnerId = (int)product.OwnerId,
            Currency = product.Currency,
            Description = product.Description,
            IsSold = product.Status,
            Name = product.Name
        };
        return await Task.FromResult(item);
    }

    public async Task UpdateAsync(Item toUpdate)
    {
        Product? product = ClientItem.getProductAsync(new SearchProductDTO { Id = toUpdate.Id, OwnerId = toUpdate.OwnerId, Name = toUpdate.Name, Description = toUpdate.Description, Price = toUpdate.Pricing ,Status = toUpdate.IsSold})
            .ResponseAsync.Result;
        Item? item = new()
        {
            Id = (int)product.Id,
            Category = product.Category,
            Pricing = product.Price,
            OwnerId = (int)product.OwnerId,
            Currency = product.Currency,
            Description = product.Description,
            IsSold = product.Status,
            Name = product.Name
        };        
        if (item == null)
        {
            throw new Exception($"Item with id {toUpdate.Id} does not exist!");
        }

        ClientItem.updateProduct(new CreateProductDTO
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