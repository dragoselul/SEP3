using System.Text;
using Application.DaoInterfaces;
using Application.Logic;
using Application.LogicInterfaces;
using BusinessLogicTier.Services;
using BusinessLogicTier.Services.Http;
using DataAccess.DAOs;
using Domain.Auth;
using FileData.DAOs;
using Microsoft.AspNetCore.Authentication.JwtBearer;
using Microsoft.IdentityModel.Tokens;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();
builder.Services.AddScoped<IUserDao, UserFileDao>();
builder.Services.AddScoped<IUserLogic, UserLogic>();
builder.Services.AddScoped<IItemDao, ItemFileDao>();
builder.Services.AddScoped<IItemLogic, ItemLogic>();
builder.Services.AddScoped<IImageLogic, ImageLogic>();
builder.Services.AddScoped<IConversationDao, ConversationFileDao>();
builder.Services.AddScoped<IConversationLogic, ConversationLogic>();
builder.Services.AddScoped<IMessageDao, MessageFileDao>();
builder.Services.AddScoped<IMessageLogic, MessageLogic>();
builder.Services.AddScoped<INotificationDao, NotificationFileDao>();
builder.Services.AddScoped<INotificationLogic, NotificationLogic>();
builder.Services.AddScoped<IImageDao, ImageFileDao>();

builder.Services.AddAuthentication(JwtBearerDefaults.AuthenticationScheme).AddJwtBearer(options =>
{
    options.RequireHttpsMetadata = false;
    options.SaveToken = true;
    options.TokenValidationParameters = new TokenValidationParameters()
    {
        ValidateIssuer = true,
        ValidateAudience = true,
        ValidAudience = builder.Configuration["Jwt:Audience"],
        ValidIssuer = builder.Configuration["Jwt:Issuer"],
        IssuerSigningKey = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(builder.Configuration["Jwt:Key"]))
    };
});

AuthorizationPolicies.AddPolicies(builder.Services);
builder.Services.AddScoped<IAuthService, AuthService>();

var app = builder.Build();
app.UseAuthentication();
app.UseAuthorization();
app.UseCors(x => x
    .AllowAnyMethod()
    .AllowAnyHeader()
    .SetIsOriginAllowed(origin => true) // allow any origin
    .AllowCredentials());


// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.Run();