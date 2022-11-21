using Application.DaoInterfaces;
using Domain.DTOs;
using Grpc.Core;
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
            LastName = user.lastName,
            Email = user.email,
            Password = user.password,
            Gender = user.gender,
            PhoneNumber = user.phoneNumber
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

    public async Task<List<User>> GetAsync(SearchUserParametersDto searchParameters)
    {
        List<User> users = new();
        AsyncServerStreamingCall<gRPCClient.User> call;
        if (searchParameters.FirstName is null)
        {
            call = ClientUser.getUsers(new SearchUserDTO
            {
                Id = 0,
                FirstName = "",
                LastName = searchParameters.LastName
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
        }
        else if (searchParameters.LastName is null)
        {
            call = ClientUser.getUsers(new SearchUserDTO
            {
                Id = 0,
                FirstName = searchParameters.FirstName,
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
        }
        else
        {
            call = ClientUser.getUsers(new SearchUserDTO
            {
                Id = 0,
                FirstName = searchParameters.FirstName,
                LastName = searchParameters.LastName
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
        }


        return await Task.FromResult(users);
    }


    public async Task<User?> GetByIdAsync(int dtoContactId)
    {
        gRPCClient.User? gRPC = ClientUser.getUserById(new SearchUserDTO
        {
            Id = dtoContactId,
            FirstName = "",
            LastName = ""
        });
        User? user = new()
        {
            Id = (int)gRPC.Id,
            firstName = gRPC.FirstName,
            lastName = gRPC.LastName,
            email = gRPC.Email,
            gender = gRPC.Gender,
            password = "",
            phoneNumber = gRPC.PhoneNumber,
            dor = new(gRPC.DateOfRegistration.Year, gRPC.DateOfRegistration.Month, gRPC.DateOfRegistration.Day,
                gRPC.DateOfRegistration.Hour, gRPC.DateOfRegistration.Minute, 0)
        };
        return await Task.FromResult(user);
    }

    public async Task<User?> GetLoginAsync(UserLoginDto loginDto)
    {
        LoginUserDTO loginUserDto = new LoginUserDTO
        {
            Email = loginDto.Email,
            Password = loginDto.Password
        };
        gRPCClient.User? login = ClientUser.login(loginUserDto);
        User? user = new()
        {
            Id = (int)login.Id,
            firstName = login.FirstName,
            lastName = login.LastName,
            email = login.Email,
            gender = login.Gender,
            password = login.Password,
            phoneNumber = login.PhoneNumber,
            dor = new(login.DateOfRegistration.Year, login.DateOfRegistration.Month, login.DateOfRegistration.Day,
                login.DateOfRegistration.Hour, login.DateOfRegistration.Minute, 0)
        };
        return await Task.FromResult(user);
    }

    public Task<User?> UpdateUserAsync(UserCreationDto toUpdate)
    {
        throw new NotImplementedException();
    }

    public Task DeleteUserById(int id)
    {
        throw new NotImplementedException();
    }
}