﻿
using Domain.Models;

namespace Domain.DTOs;

public class UserCreationDto
{
    public string FirstName { get;}
    public string LastName { get;}
    public string Email { get; }
    public string Password { get; }
    public string PhoneNumber { get; }
    public bool Gender { get; }
    public DateTime Dor { get; }

    public List<Item> ItemsList { get; }

    public UserCreationDto(string firstName, string lastName, string email, string password, string phoneNumber, bool gender, DateTime dor, List<Item> itemsList)
    {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
        PhoneNumber = phoneNumber;
        Gender = gender;
        Dor = dor;
        ItemsList = itemsList;

    }
}