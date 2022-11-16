﻿using Application.DaoInterfaces;
using Domain.DTOs;
using Grpc.Net.Client;
using gRPCClient;
using User = Domain.Models.User;

namespace FileData.DAOs;

public class UserFileDao : IUserDao
{
    private readonly GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:6565");
    private UserService.UserServiceClient ClientUser;

    public UserFileDao()
    {
        ClientUser = new(channel);
    }

    public async Task<User> CreateAsync(User user)
    {
        await ClientUser.createUserAsync(new CreateUserDTO
        {
            FirstName = user.firstName,
            Email = user.email,
            LastName = user.lastName,
            Gender = user.gender,
            Password = user.password,
            PhoneNumber = user.phoneNumber,
        });

        return await Task.FromResult(user);
    }

    /*
    public async Task<User?> GetByNameAsync(string firstName, string lastName)
    {
        gRPCClient.User? gRPC = ClientUser.getUserAsync(new SearchUserDTO
        {
            Id   = 0,
            FirstName = firstName,
            LastName = lastName
        }).ResponseAsync.Result;
        User? user = new()
        {
            Id = (int)gRPC.Id,
            firstName = gRPC.FirstName,
            lastName = gRPC.LastName,
            email = gRPC.Email,
            gender = gRPC.Gender,
            password = gRPC.Password,
            phoneNumber = gRPC.PhoneNumber,
            dor = new(gRPC.DateOfRegistration.Year, gRPC.DateOfRegistration.Month,gRPC.DateOfRegistration.Day, gRPC.DateOfRegistration.Hour, gRPC.DateOfRegistration.Minute, 0)
        };
        return await Task.FromResult(user);
    }
    */

    public Task<List<User>> GetAsync(SearchUserParametersDto searchParameters)
    {
        List<User> users = new();
        while(true)
            {
                gRPCClient.User? gRPC = ClientUser.getUserAsync(new SearchUserDTO
                {
                    Id = 0,
                    FirstName = searchParameters.FirstName,
                    LastName = searchParameters.LastName
                }).ResponseAsync.Result;
                User? user = new()
                {
                    Id = (int)gRPC.Id,
                    firstName = gRPC.FirstName,
                    lastName = gRPC.LastName,
                    email = gRPC.Email,
                    gender = gRPC.Gender,
                    password = gRPC.Password,
                    phoneNumber = gRPC.PhoneNumber,
                    dor = new(gRPC.DateOfRegistration.Year, gRPC.DateOfRegistration.Month, gRPC.DateOfRegistration.Day,
                        gRPC.DateOfRegistration.Hour, gRPC.DateOfRegistration.Minute, 0)
                };
                if(user is null)
                    break;
                users.Add(user);
            }
        return Task.FromResult(users);
    }
    

    public async Task<User?> GetByIdAsync(int dtoContactId)
    {
        gRPCClient.User? gRPC = ClientUser.getUserAsync(new SearchUserDTO
        {
            Id = dtoContactId,
            FirstName = "",
            LastName = ""
        }).ResponseAsync.Result;
        User? user = new()
        {
            Id = (int)gRPC.Id,
            firstName = gRPC.FirstName,
            lastName = gRPC.LastName,
            email = gRPC.Email,
            gender = gRPC.Gender,
            password = gRPC.Password,
            phoneNumber = gRPC.PhoneNumber,
            dor = new(gRPC.DateOfRegistration.Year, gRPC.DateOfRegistration.Month, gRPC.DateOfRegistration.Day,
                gRPC.DateOfRegistration.Hour, gRPC.DateOfRegistration.Minute, 0)
        };
        return await Task.FromResult(user);
    }
}