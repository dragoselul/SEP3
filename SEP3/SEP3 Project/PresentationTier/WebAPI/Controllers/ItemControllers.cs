using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class ItemController : ControllerBase
{
    private readonly IItemLogic todoLogic;

    public ItemController(IItemLogic todoLogic)
    {
        this.todoLogic = todoLogic;
    }
    
    
    [HttpPost]
    public async Task<ActionResult<Item>> CreateAsync([FromBody]ItemCreationDto dto)
    {
        try
        {
            Item created = await todoLogic.CreateAsync(dto);
            return Created($"/item/{created.Id}", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}