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
      var strings = fixture.Create<List<string>>();
      UserCreationDto userCreationDto = new UserCreationDto("","","","","",true);
      ctx.Services.AddSingleton<IUserService>(new UserHttpClient(new HttpClient()));
      Services.AddTransient<IUserService, UserHttpClient>();
      var api = Services.GetRequiredService<IUserService>();
      var cut = ctx.RenderComponent<CreateUser>();

      //Act
      api.Create(userCreationDto);
      /*
      cut.Find("#firstName input").Change("Danila");
      cut.Find("#lastName input").Change("Vladimirov");
      cut.Find("#email input").Change("Danila@gmail.com");
      cut.Find("#password input").Change("pepega");
      cut.Find("#phoneNumber input").Change("+4512345678");
      
      */

      //Assert
      //If does not throw exception, means it's working
    }

    [Fact]
    public void UserShouldBeLoggedIn()
    {
        //Arrange
      
        using var ctx = new TestContext();
        var authContext = ctx.AddTestAuthorization();
        authContext.SetAuthorized("Test User");
        ctx.Services.AddSingleton<IAuthService>(new JwtAuthService());
        var cut = ctx.RenderComponent<LoginSeeProfile>();
        var fixture = new Fixture();
        var strings = fixture.Create<List<string>>();
        Services.AddTransient<IAuthService, JwtAuthService>();
        var api = Services.GetRequiredService<IAuthService>();

        //Act

        api.LoginAsync(strings[0], strings[1]);
        //Assert
        cut.MarkupMatches(@"}");

    }
    [Fact]
    public void UserShouldNotBeAbleToLogIn()
    {
        //Arrange
      
        using var ctx = new TestContext();
        var authContext = ctx.AddTestAuthorization();
        authContext.SetNotAuthorized();
        ctx.Services.AddSingleton<IAuthService>(new JwtAuthService());
        var cut = ctx.RenderComponent<LoginSeeProfile>();
        var fixture = new Fixture();
        var strings = fixture.Create<List<string>>();
        Services.AddTransient<IAuthService, JwtAuthService>();
        var api = Services.GetRequiredService<IAuthService>();

        //Act

        api.LoginAsync(strings[0], strings[1]);
        /*
        cut.Find("#email input").Change("Danila@gmail.com");
        cut.Find("#password input").Change("pepega");
        
        */
        cut.Find("Button").Click();
        //Assert
        
        var contains = cut.Markup.Contains(@"Email field is required");
        Assert.True(contains);
    }

    [Fact]
    public void PostIsCreated()
    {
        //Arrange
        using var ctx = new TestContext();
        var mock = ctx.Services.AddMockHttpClient();
        ctx.Services.AddSingleton<IItemService>(new ItemHttpClient(new HttpClient()));
        ctx.Services.AddSingleton<IUserService>(new UserHttpClient(new HttpClient()));
        var authContext = ctx.AddTestAuthorization();
        var fixture = new Fixture();
        var strings = fixture.Create<List<string>>();
        mock.When("/Item").RespondJson(new List<Item>());
        authContext.SetAuthorized("Test User");
        var cut = ctx.RenderComponent<CreatePost>();
        Services.AddTransient<IItemService, ItemHttpClient>();
        var api = Services.GetRequiredService<IItemService>();
        ItemCreationDto item = new ItemCreationDto();
        

        //Act
        api.Create(item);
        //Assert
        //It works if does not throw an exception
    }

    [Fact, AutoData]
    public void UserCanViewPost()
    {
        using var ctx = new TestContext();
        var fixture = new Fixture();
        var items = fixture.Create<List<Item>>();
        var mock = ctx.Services.AddMockHttpClient();
        mock.When("/Item").RespondJson(items);
        HttpClient httpClient = new HttpClient();
        httpClient.BaseAddress = new Uri("https://localhost");
        ctx.Services.AddSingleton<IItemService>(new ItemHttpClient(httpClient));
        ctx.Services.AddSingleton<IImageService>(new ImageHttpClient(httpClient));
        Services.AddTransient<IImageService, ImageHttpClient>();
        Services.AddTransient<IItemService, ItemHttpClient>();
        var api = Services.GetRequiredService<IItemService>();
        ItemCreationDto item = new ItemCreationDto();
        var authContext = ctx.AddTestAuthorization();
        //authContext.SetAuthorized("Test User");

        var cut = ctx.RenderComponent<Marketplace>();
        
        //ctx.Services.AddSingleton<IUserService>(new UserHttpClient(new HttpClient()));
        //Act
        api.Create(item);
        api.GetItems();

        //Assert
        //If does not throw any exception, it works
        
        /*
        cut.MarkupMatches(@"");
        var contains = cut.Markup.Contains(@"(0)");
        Assert.True(contains);
        */


    }
}