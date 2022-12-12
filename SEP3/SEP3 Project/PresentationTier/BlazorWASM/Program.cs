using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using BlazorWASM;
using BlazorWasm.Auth;
using BlazorWasm.Services;
using BlazorWasm.Services.Http;
using HttpClients.ClientInterfaces;
using HttpClients.Implementations;
using Microsoft.AspNetCore.Components.Authorization;
using Shared.Auth;
using Syncfusion.Blazor;


var builder = WebAssemblyHostBuilder.CreateDefault(args);
builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");
builder.Services.AddScoped<AuthenticationStateProvider, CustomAuthProvider>();
builder.Services.AddScoped<IAuthService, JwtAuthService>();
builder.Services.AddScoped(sp => new HttpClient { BaseAddress = new Uri(builder.HostEnvironment.BaseAddress) });
builder.Services.AddScoped<IUserService, UserHttpClient>();
builder.Services.AddScoped<IItemService, ItemHttpClient>();
builder.Services.AddScoped<IImageService, ImageHttpClient>();
builder.Services.AddScoped<IConversationService, ConversationHttpClient>();
builder.Services.AddScoped<IMessageService, MessageHttpClient>();
builder.Services.AddScoped<INotificationService, NotificationService>();
builder.Services.AddSyncfusionBlazor();
AuthorizationPolicies.AddPolicies(builder.Services);
builder.Services.AddScoped(
    sp => 
        new HttpClient { 
            BaseAddress = new Uri("https://localhost:7171") 
        }
);

builder.Services.AddAuthorizationCore();
await builder.Build().RunAsync();