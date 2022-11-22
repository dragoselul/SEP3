using BlazorWASM.Pages;
using Bunit;
using HttpClients.ClientInterfaces;
using HttpClients.Implementations;
using Microsoft.Extensions.DependencyInjection;

namespace PresentationTierTest;

public class UnitTest1 : TestContext
{
    [Fact]
    public void UserShouldBeCreated()
    {
      //Arrange
      
      using var ctx = new TestContext();
      ctx.Services.AddSingleton<IUserService>(new UserHttpClient(new HttpClient()));
      var cut = ctx.RenderComponent<CreateUser>();

      //Act
      cut.Find("#firstName input").Change("Danila");
      cut.Find("#lastName input").Change("Vladimirov");
      cut.Find("#emailName input").Change("Danila@gmail.com");
      cut.Find("#passwordName input").Change("pepega");
      cut.Find("#phoneNumber input").Change("+4512345678");
      cut.Find("#create Button").Click();

      //Assert

      
    }
}