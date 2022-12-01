using Application.Logic;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class ConversationController : ControllerBase
{
    
    private readonly IConversationLogic ConversationLogic;

    public ConversationController(ConversationLogic conversationLogic)
    {
        ConversationLogic = conversationLogic;
    }
    
    
    [HttpPost]
    public async Task<ActionResult<Conversation>> CreateAsync([FromBody] ConversationCreationDto dto)
    {
        try
        {
            Conversation created = await ConversationLogic.CreateAsync(dto);
            return Created($"/Conversation/{created.Id}", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet]
    public async Task<ActionResult<List<Conversation>>> GetByUserAsync([FromQuery] int userId)
    {
        try
        {
            List<Conversation> conversations = await ConversationLogic.GetByUserIdAsync(userId);
            return Ok(conversations);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet("{id:int}")]
    public async Task<ActionResult<List<Conversation>>> GetByIdAsync([FromRoute] int id)
    {
        try
        {
            var Conversations = await ConversationLogic.GetByIdAsync(id);
            return Ok(Conversations);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

}