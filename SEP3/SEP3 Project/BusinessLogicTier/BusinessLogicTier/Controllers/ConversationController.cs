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
    
    private readonly IConversationLogic conversationLogic;

    public ConversationController(IConversationLogic conversationLogic)
    {
        this.conversationLogic = conversationLogic;
    }
    
    
    [HttpPost]
    public async Task<ActionResult<Conversation>> CreateAsync([FromBody] ConversationCreationDto dto)
    {
        try
        {
            var created = await conversationLogic.CreateAsync(dto);
            return Created($"/conversation/{created.Id}", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet]
    public async Task<ActionResult<List<Conversation>>> GetByUserIdAsync([FromQuery] int userId)
    {
        try
        {
            List<Conversation> conversations = await conversationLogic.GetByUserIdAsync(userId);
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
            var Conversations = await conversationLogic.GetByIdAsync(id);
            return Ok(Conversations);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

}