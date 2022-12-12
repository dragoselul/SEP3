using System.Net;
using System.Text.Json;
using AngleSharp.Dom;
using AutoFixture;
using AutoFixture.NUnit3;
using BlazorWASM.Pages;
using BlazorWasm.Services;
using BlazorWasm.Services.Http;
using Bunit;
using Bunit.TestDoubles;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;
using HttpClients.Implementations;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.VisualBasic.CompilerServices;
using NUnit.Framework;
using RichardSzalay.MockHttp;
using Assert = Xunit.Assert;
using TestContext = Bunit.TestContext;

namespace PresentationTierTest;

[TestFixture]
public class UnitTest1 : TestContext
{
    [Fact, AutoData]
    public void UserShouldBeCreated()
    {
      //Arrange
      
      using var ctx = new TestContext();
      ctx.Services.AddSingleton<IUserService>(new UserHttpClient(new HttpClient()));
      var fixture = new Fixture();
      var fakeUser = fixture.Create<User>();
      var mock = Services.AddMockHttpClient();
      mock.When("/Auth/register").RespondJson(fakeUser);
      UserCreationDto userCreationDto = fixture.Create<UserCreationDto>();
      ctx.Services.AddSingleton<IUserService>(new UserHttpClient(new HttpClient()));
      Services.AddTransient<IUserService, UserHttpClient>();
      var api = Services.GetRequiredService<IUserService>();
      var cut = ctx.RenderComponent<CreateUser>();

      //Act
      api.Create(userCreationDto);

      //Assert
      Assert.NotNull(api.Create(userCreationDto).Result.Id);
    }

    [Fact]
    public void UserShouldBeLoggedIn()
    {
        //Arrange
      
        using var ctx = new TestContext();
        var authContext = ctx.AddTestAuthorization();
        authContext.SetAuthorized("Test User");
        ctx.Services.AddSingleton<IAuthService>(new JwtAuthService());
        ctx.Services.AddSingleton<IUserService>(new UserHttpClient(new HttpClient()));
        var cut = ctx.RenderComponent<LoginSeeProfile>();
        var fixture = new Fixture();
        var strings = fixture.Create<List<string>>();
        Services.AddTransient<IAuthService, JwtAuthService>();
        var api = Services.GetRequiredService<IAuthService>();

        //Act

        api.LoginAsync(strings[0], strings[1]);
        //Assert
        cut.Markup.Contains(@"Edit your profile");
        //Basically checks if the page is converted to the edit page

    }
    /*
    [Fact]
    public void UserShouldNotBeAbleToLogIn()
    {
        //Arrange
      
        using var ctx = new TestContext();
        var authContext = ctx.AddTestAuthorization();
        authContext.SetNotAuthorized();
        var fixture = new Fixture();
        var strings = fixture.Create<List<string>>();
        var users = fixture.Create<IEnumerable<User>>();
        var mock = Services.AddMockHttpClient();
        mock.When("/Users").RespondJson(users);
        ctx.Services.AddSingleton<IAuthService>(new JwtAuthService());
        ctx.Services.AddSingleton<IUserService>(new UserHttpClient(new HttpClient()));
        var cut = ctx.RenderComponent<LoginSeeProfile>();
        
        Services.AddTransient<IAuthService, JwtAuthService>();
        var api = Services.GetRequiredService<IAuthService>();

        //Act

        api.LoginAsync(strings[0], strings[1]);
    
        cut.Find("Button").Click();
        //Assert
        
        var contains = cut.Markup.Contains(@"Email field is required");
        Assert.True(contains);
    }
*/
    [Fact] 
    public void PostIsCreated_ItemShouldBeCreated()
    {
        //Arrange
        using var ctx = new TestContext();
        var mock = Services.AddMockHttpClient();
        ctx.Services.AddSingleton<IItemService>(new ItemHttpClient(new HttpClient()));
        ctx.Services.AddSingleton<IUserService>(new UserHttpClient(new HttpClient()));
        var authContext = ctx.AddTestAuthorization();
        var fixture = new Fixture();
        var items = fixture.Create<List<Item>>();
        var fakeitem = fixture.Create<Item>();
        items[0].Id.ToString();
        ItemCreationDto item = fixture.Create<ItemCreationDto>();
        //ItemCreationDto item = new ItemCreationDto();
        mock.When("/Item").RespondJson(fakeitem);
        //mock.When("https://localhost:7171/Item").RespondJson(fakeitem);
        authContext.SetAuthorized("Test User");
        var cut = ctx.RenderComponent<CreatePost>();
        Services.AddTransient<IItemService, ItemHttpClient>();
        var api = Services.GetRequiredService<IItemService>();
        //ItemCreationDto item = new ItemCreationDto();
        

        //Act
        api.Create(item);
        //Assert
        Assert.NotNull(api.Create(item).Result.Id);
    }
/*
    [Fact, AutoData]
    public void UserCanViewPost()
    {
        using var ctx = new TestContext();
        var fixture = new Fixture();
        var items = fixture.Create<List<Item>>();
        var mock = Services.AddMockHttpClient();
        mock.When("/Item").RespondJson(items);
        var servermock = ctx.Services.AddMockHttpClient();
        servermock.When("/ViewItem/@items[i].Id").RespondJson(items);
        HttpClient httpClient = new HttpClient();
        httpClient.BaseAddress = new Uri("https://localhost");
        ctx.Services.AddSingleton<IItemService>(new ItemHttpClient(httpClient));
        ctx.Services.AddSingleton<IImageService>(new ImageHttpClient(httpClient));
        Services.AddTransient<IImageService, ImageHttpClient>();
        Services.AddTransient<IItemService, ItemHttpClient>();
        var api = Services.GetRequiredService<IItemService>();
        ItemCreationDto item = new ItemCreationDto()
        {
            Name = "stuff",
            Description = "stuff",
            ContactId = 1,
            Pricing = 500,
            Category = "Electronics",
            Currency = "EURO",
            IsSold = false
        };
        var authContext = ctx.AddTestAuthorization();
        

        var cut = ctx.RenderComponent<Marketplace>();
        cut.Find("item card").InnerHtml.Remove(1);
        
        
        api.Create(item);
        api.GetItems("stuff","stuff",1,500,500,false,"Electronics");

        //Assert
        
        //If does not throw any exception, it works
        
       
    }

    [Fact]
    public async void ItemsFilter()
    {
        using var ctx = new TestContext();
        var fixture = new Fixture();
        var items = new List<Item>();
        Domain.Models.Item fakeItem = new Item()
        {
            Name = "stuff",
            Id = 1,
            Description = "stuff",
            OwnerId = 1,
            Pricing = 500,
            Category = "Electronics",
            Currency = "Euro",
            IsSold = false,
            ContactFirstName = "Dan",
            ContactLastName = "Ceapa"
        };
        items.Add(fakeItem);
        var json = JsonSerializer.Serialize(fakeItem);
        var mock = Services.AddMockHttpClient();
        mock.When("/Item").RespondJson(json);
        HttpClient httpClient = new HttpClient();
        httpClient.BaseAddress = new Uri("https://localhost");
       
        ctx.Services.AddSingleton<IItemService>(new ItemHttpClient(httpClient));
        ctx.Services.AddSingleton<IImageService>(new ImageHttpClient(httpClient));
        Services.AddTransient<IImageService, ImageHttpClient>();
        Services.AddTransient<IItemService, ItemHttpClient>();
        var api = Services.GetRequiredService<IItemService>();
        ItemCreationDto item = new ItemCreationDto(){
            Name = "stuff",
            Description = "stuff",
            ContactId = 1,
            Pricing = 500,
            Category = "Electronics",
            Currency = "EURO",
            IsSold = false
        };
        var authContext = ctx.AddTestAuthorization();
        authContext.SetAuthorized("Test User");
        
        await api.Create(item);
        await api.GetItems("stuff","stuff",1,500,500,false,"Electronics");

        //var cut = ctx.Render(@<Marketplace>);
        var cut = ctx.RenderComponent<Marketplace>();
        cut.MarkupMatches(@"");
    }
    */
}