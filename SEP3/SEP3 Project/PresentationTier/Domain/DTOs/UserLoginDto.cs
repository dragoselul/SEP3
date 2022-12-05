using System.ComponentModel.DataAnnotations;

namespace Domain.DTOs;

public class UserLoginDto
{
    [Required (ErrorMessage = "Email field is required")]
    public string Email { get; set; }
    [Required (ErrorMessage = "Password field is required")]
    public string Password { get; set; }
}