using Application.DaoInterfaces;
using Application.Logic;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class MessageController : ControllerBase
{
    
    private readonly IMessageLogic MessageLogic;

    public MessageController(IMessageLogic messageLogic)
    {
        MessageLogic = messageLogic;
    }

    [HttpPost]
    public async Task<ActionResult<Message>> CreateAsync([FromBody] MessageCreationDto dto)
    {
        try
        {
            Message created = await MessageLogic.CreateAsync(dto);
            return Created($"/Message/{created.Id}", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet]
    public async Task<ActionResult<List<Message>>> GetByConversationAsync([FromQuery] int userId)
    {
        try
        {
            List<Message> Messages = await MessageLogic.GetByConversationIdAsync(userId);
            return Ok(Messages);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet("{id:int}")]
    public async Task<ActionResult<List<Message>>> GetByIdAsync([FromRoute] int id)
    {
        try
        {
            var Messages = await MessageLogic.GetByIdAsync(id);
            return Ok(Messages);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
}