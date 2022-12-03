namespace Domain.DTOs;

public class UserUpdateDto
{
    public int Id { get; }
    public string FirstName { get; }
    public string LastName { get; }
    public string Email { get; }
    public string Password { get; }
    public string PhoneNumber { get; }
    public bool Gender { get; }


    public UserUpdateDto(int id, string firstName, string lastName, string email, string password, string phoneNumber,
        bool gender)
    {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
        PhoneNumber = phoneNumber;
        Gender = gender;
    }
}