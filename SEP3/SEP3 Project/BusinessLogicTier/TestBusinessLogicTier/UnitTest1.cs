using Application.Logic;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using FakeItEasy;
using FileData.DAOs;
using Grpc.Core;
using Grpc.Core.Testing;
using Microsoft.AspNetCore.Mvc;
using WebAPI.Controllers;

namespace TestBusinessLogicTier;

public class Tests
{

    [Fact]
    public async void Test1()
    {
        //Arrange

        int count = 1;
        // var fakeUsers = A.CollectionOfDummy<SearchUserParametersDto>(count).AsEnumerable();\
        var fakeUsers = A.CollectionOfDummy<User>(count).AsEnumerable();
        User user = A.Fake<User>();
        List<User> users = A.Fake<List<User>>();
        users.Add(user);
        var fakeFirstName = "First";
        var fakeLastName = "Second";
        var userLogic = A.Fake<UserLogic>();
        var dataStore = A.Fake<UserFileDao>();
        var searchParameters = A.Fake<SearchUserParametersDto>();
        A.CallTo(() => dataStore.GetAsync(searchParameters)).Returns(Task.FromResult(users));
        var controller = new UsersController(userLogic);
        
        //Act
        var actionResult = await controller.GetAsync(fakeFirstName, fakeLastName);
        
        //Assert
        var result = actionResult.Result as OkObjectResult;
        var returnUsers = result.Value as IEnumerable<User>;
        Assert.Equal(count, returnUsers.Count());


    }
    [Fact]
    public async Task Call_Grpc_Method_Test()
    {
        var grpcService = _service.GetRequiredService<IMyService>();

        var request = new MyRequest {When=DateTime.Now.AddDays(30)};
    
        var context = TestServerCallContext.Create(
            method: nameof(IMyService.WinningLotteryNumbers)
            , host: "localhost"
            , deadline: DateTime.Now.AddMinutes(30)
            , requestHeaders: new Metadata()
            , cancellationToken: CancellationToken.None
            , peer: "10.0.0.25:5001"
            , authContext: null
            , contextPropagationToken: null
            , writeHeadersFunc: (metadata) => Task.CompletedTask
            , writeOptionsGetter: () => new WriteOptions()
            , writeOptionsSetter: (writeOptions) => { }
        ) ;
        var answer= await grpcService.WinningLotteryNumbers(request, context);
        Assert.IsNotNull(answer);

    }
}