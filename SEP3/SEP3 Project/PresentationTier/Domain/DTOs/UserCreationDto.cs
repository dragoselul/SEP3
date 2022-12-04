using System.ComponentModel.DataAnnotations;
using Domain.Models;

namespace Domain.DTOs;

public class UserCreationDto
{
    [Required(ErrorMessage = "First name field is required.")]
    public string FirstName { get; set; } = "";

    [Required(ErrorMessage = "Last name field is required.")]
    public string LastName { get; set; } = "";

    [Required(ErrorMessage = "Email field is required.")]
    public string Email { get; set; } = "";

    [Required(ErrorMessage = "Password field is required.")]
    public string Password { get; set; } = "";

    [Required(ErrorMessage = "Phone number field is required.")]
    public string PhoneNumber { get; set; } = "";

    [Required(ErrorMessage = "Gender is required.")]
    public bool Gender { get; set; }


    public UserCreationDto(string firstName, string lastName, string email, string password, string phoneNumber,
        bool gender)
    {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
        PhoneNumber = phoneNumber;
        Gender = gender;
    }

    public UserCreationDto()
    {
    }
}