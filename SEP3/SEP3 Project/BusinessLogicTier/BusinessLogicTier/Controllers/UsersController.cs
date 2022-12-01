using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class UsersController : ControllerBase
{
    private readonly IUserLogic userLogic;

    public UsersController(IUserLogic userLogic)
    {
        this.userLogic = userLogic;
    }

    [HttpPost]
    public async Task<ActionResult<User>> CreateAsync(UserCreationDto dto)
    {
        try
        {
            User user = await userLogic.CreateAsync(dto);
            return Created($"/users/{user.Id}", user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    public async Task<ActionResult<List<User>>> GetAsync([FromQuery] string? firstName, [FromQuery] string? lastName)
    {
        try
        {
            SearchUserParametersDto parameters = new()
            {
                FirstName = firstName,
                LastName = lastName
            };
            List<User> users = await userLogic.GetAsync(parameters);
            return Ok(users);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("Login")]
    public async Task<ActionResult<User>> GetLoginAsync([FromQuery] string? email, [FromQuery] string? password)
    {
        try
        {
            UserLoginDto parameters = new()
            {
                Email = email,
                Password = password
            };
            User? users = await userLogic.GetLoginAsync(parameters);
            return Ok(users);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("{id:int}")]
    public async Task<ActionResult<User>> GetByIdAsync([FromRoute] int id)
    {
        try
        {
            User user = await userLogic.GetByIdAsync(id);
            return Ok(user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPatch]
    public async Task<ActionResult<User>> UpdateUserAsync([FromBody] UserUpdateDto dto)
    {
        try
        {
            User user = await userLogic.UpdateUserAsync(dto);
            return Ok(user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpDelete("{id:int}")]

    public async Task<ActionResult> DeleteUserAsync([FromRoute] int id)
    {
        try
        { 
            await userLogic.DeleteByIdAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}