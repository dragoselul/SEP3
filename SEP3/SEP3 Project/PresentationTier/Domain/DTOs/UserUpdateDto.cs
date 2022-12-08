using System.ComponentModel.DataAnnotations;

namespace Domain.DTOs;

public class UserUpdateDto
{
    public int Id { get; set; }
    public string FirstName { get; set; } = "";
    public string LastName { get; set; } = "";
    public string Email { get; set; } = "";
    public string Password { get; set; } = "";
    public string PhoneNumber { get; set; } = "";
    public bool Gender { get; set; }
}