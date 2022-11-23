using AutoFixture;
using AutoFixture.NUnit3;
using BlazorWASM.Pages;
using Bunit;
using Domain.DTOs;
using HttpClients.ClientInterfaces;
using HttpClients.Implementations;
using Microsoft.AspNetCore.Components.Forms;
using Microsoft.Extensions.DependencyInjection;
using NUnit.Framework;
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
        var cut = ctx.RenderComponent<CreateUser>();
        var fixture = new Fixture();
        var strings = fixture.Create<List<string>>();
        UserCreationDto userCreationDto = new UserCreationDto("one","two","three","four","five",true);
        var api = Services.GetRequiredService<UserHttpClient>();
        //Act
      
        api.Create(userCreationDto);
      
        //Assert
        //cut.Markup

    }
}