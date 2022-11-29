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
using RichardSzalay.MockHttp;

namespace PresentationTierTest;

public class UnitTest1 : TestContext
{
    [Fact, AutoData]
    public void UserShouldBeCreated()
    {
      //Arrange
      
      using var ctx = new TestContext();
      ctx.Services.AddSingleton<IUserService>(new UserHttpClient(new HttpClient()));
      var cut = ctx.RenderComponent<CreateUser>();
      var fixture = new Fixture();
      var strings = fixture.Create<List<string>>();
      UserCreationDto userCreationDto = new UserCreationDto("","","","","",true);
      Services.AddTransient<IUserService, UserHttpClient>();
      var api = Services.GetRequiredService<IUserService>();

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
        cut.MarkupMatches(@"");

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
        var contains = cut.Markup.Contains(@"Error: String reference not set to an instance of a String. (Parameter 's')");
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
        mock.When("/Item").RespondJson(new List<Item>());
        authContext.SetAuthorized("Test User");
        var cut = ctx.RenderComponent<CreatePost>();
        var fixture = new Fixture();
        var strings = fixture.Create<List<string>>();
        Services.AddTransient<IItemService, ItemHttpClient>();
        var api = Services.GetRequiredService<IItemService>();
        ItemCreationDto item = new ItemCreationDto();
        

        //Act
        api.Create(item);
        //Assert
        var contains = cut.Markup.Contains(@"<h4></h4>");
        Assert.True(contains);
    }
}