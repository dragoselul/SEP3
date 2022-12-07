using Grpc.Core;
using Grpc.Net.Client;
using gRPCClient;
using User = Domain.Models.User;
using Item = Domain.Models.Item;

namespace TestBusinessLogicTier;

public class Tests
{
    //This test class only works with the database server online
    [Fact]
    public async Task GetUser_ShouldReturnUser()
    {
        // Arrange
        GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
        UserService.UserServiceClient sut = new UserService.UserServiceClient(channel);
        List<User> users = new();
        // Act
        var call = sut.getUsers(new SearchUserDTO
        {
            Id = 1,
            FirstName = "",
            LastName = ""
        });
        await foreach (var response in call.ResponseStream.ReadAllAsync())
        {
            User? user = new()
            {
                Id = (int)response.Id,
                firstName = response.FirstName,
                lastName = response.LastName,
                email = response.Email,
                gender = response.Gender,
                password = "",
                phoneNumber = response.PhoneNumber,
                dor = new(response.DateOfRegistration.Year, response.DateOfRegistration.Month,
                    response.DateOfRegistration.Day,
                    response.DateOfRegistration.Hour, response.DateOfRegistration.Minute, 0)
            };
            users.Add(user);
        }
        // Assert
        Assert.Equal("Dan-Sebastian", users[1].firstName);
            
    }

    [Fact]
    public async void CreateItemAndGetItem_ShouldCreateAnItem_ShouldBeAbleToSeeGetTheItem()
    {
        //Arrange
        GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
        ItemService.ItemServiceClient? ClientItem = new ItemService.ItemServiceClient(channel);


        //Act
        await ClientItem.createItemAsync(new CreateItemDTO
        {
            OwnerId = 1,
            Category = "Electronics",
            Currency = "Euro",
            Description = "Stuff",
            Name = "Stuff",
            Price = 500,
            Status = false
        });
        List<Item> items = new();
        
        var call = ClientItem.getItems(new SearchItemDTO() { Name = "Stuff",Description = "Stuff",Id = 3, Category = "Electronics",
            MaxPrice = 500,MinPrice = 500,OwnerId = 1,Status = false});
        await foreach (var response in call.ResponseStream.ReadAllAsync())
        { 
            Item? toSend = new()
            {
                Id = (int)response.Id,
                Category = response.Category,
                Pricing = response.Price,
                OwnerId = (int)response.Owner.Id,
                Currency = response.Currency,
                Description = response.Description,
                IsSold = response.Status,
                Name = response.Name
            };
            items.Add(toSend);
        }
        
        //Assert
        Assert.Equal("Stuff", items[0].Name);
    }
    
}