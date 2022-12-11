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
    public async void CreateUser_GetUser_ShouldCreateAndGetUser()
    {
        //Arrange
        GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
        UserService.UserServiceClient sut = new UserService.UserServiceClient(channel);
        
        //Act
        //Creating
        await sut.createUserAsync(new CreateUserDTO
        {
            FirstName = "Chad",
            LastName = "Chaddler",
            Email = "chad@gmail.com",
            Password = "super",
            Gender = true,
            PhoneNumber = "+4512345678"
        });
        //Getting
        List<User> users = new();
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
        
        string name = null;
        for (int i = 0; i < users.Count; i++)
        {
            if (users[i].firstName.Equals("Chad"))
            {
                name = "Chad";
            }
        }
        //Assert
        Assert.Equal("Chad", name);
        
    }

    [Fact]
    public async void CreateItemAndGetItem_ShouldCreateAnItem_ShouldBeAbleToSeeGetTheItem()
    {
        //Arrange
        GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
        ItemService.ItemServiceClient? ClientItem = new ItemService.ItemServiceClient(channel);
        
        //Act
        //Creating
        await ClientItem.createItemAsync(new CreateItemDTO
        {
            OwnerId = 112,
            Category = "Electronics",
            Currency = "Euro",
            Description = "Stuff",
            Name = "Stuff",
            Price = 500,
            Status = false
        });
        //Getting
        List<Item> items = new();
        
        var call = ClientItem.getItems(new SearchItemDTO() { Name = "Stuff",Description = "Stuff",Id = 1, Category = "Electronics",
            MaxPrice = 500,MinPrice = 500,OwnerId = 112,Status = false});
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

    [Fact]
    public async void EditProfile_ShouldBeAbleToEditUser()
    {
        //Arrange
        GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
        UserService.UserServiceClient ClientUser = new UserService.UserServiceClient(channel);
        List<User> users1 = new();
        var call1 = ClientUser.getUsers(new SearchUserDTO
        {
            Id = 3,
            FirstName = "",
            LastName = ""
        });
        await foreach (var response1 in call1.ResponseStream.ReadAllAsync())
        {
            User? user1 = new()
            {
                Id = (int)response1.Id,
                firstName = response1.FirstName,
                lastName = response1.LastName,
                email = response1.Email,
                gender = response1.Gender,
                password = "",
                phoneNumber = response1.PhoneNumber,
                dor = new(response1.DateOfRegistration.Year, response1.DateOfRegistration.Month,
                    response1.DateOfRegistration.Day,
                    response1.DateOfRegistration.Hour, response1.DateOfRegistration.Minute, 0)
            };
            users1.Add(user1);
        }

        List<int> ids = new List<int>();
        for (int i = 0; i < users1.Count; i++)
        {
            ids.Add(users1[i].Id);
        }
        //Act
        //Updating
        UpdateUserDTO ToUpdate = new()
        {
            Id = ids[0],
            Email = "not@gmail.com",
            FirstName = "Drug",
            LastName = "Damiro",
            Gender = false,
            Password = "super",
            PhoneNumber =  "+4587654321"
        };
        await ClientUser.updateUserAsync(ToUpdate);
        //Getting
        List<User> users = new();
        var call = ClientUser.getUsers(new SearchUserDTO
        {
            Id = 3,
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
        string name = null;
        for (int i = 0; i < users.Count; i++)
        {
            if (users[i].firstName.Equals("Drug"))
            {
                name = "Drug";
            }
        }
        
        //Assert
        Assert.Equal("Drug", name);
    }

    [Fact]
    public async Task DeleteUser_UserShouldNotExistAfter()
    {
        //For this test, Run the Creation of the user and input the id into toDelete.
        
        //Arrange
        GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
        UserService.UserServiceClient ClientUser = new UserService.UserServiceClient(channel);
        
        //Act
        //Deleting
        SearchUserDTO ToDelete = new()
        {
            Id = 112,
            FirstName = "",
            LastName = ""
        };
        await ClientUser.deleteUserAsync(ToDelete);
        
        //Getting
        List<User> users = new();
        var call = ClientUser.getUsers(new SearchUserDTO
        {
            Id = 3,
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
        string name = null;
        for (int i = 0; i < users.Count; i++)
        {
            if (users[i].Id == 3)
            {
                name = "Drug";
            }
        }
        //Assert
        Assert.NotEqual("Drug", name);
    }
}