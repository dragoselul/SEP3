using System.Text.Json;
using Application.Logic;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class ItemController : ControllerBase
{
    private readonly IItemLogic itemLogic;

    public ItemController(IItemLogic itemLogic)
    {
        this.itemLogic = itemLogic;
    }


    [HttpPost]
    public async Task<ActionResult<Item>> CreateAsync([FromBody] ItemCreationDto dto)
    {
        try
        {
            Item created = await itemLogic.CreateAsync(dto);
            return Created($"/item/{created.Id}", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    public async Task<ActionResult<List<Item>>> GetAsync([FromQuery] string? name, [FromQuery] string? description,
        [FromQuery] int? contactId, [FromQuery] double? minPrice, [FromQuery] double? maxPrice,
        [FromQuery] bool? isSold, [FromQuery] string? category)
    {
        try
        {
            SearchItemParametersDto parameters = new()
            {
                Name = name,
                Description = description,
                ContactId = contactId,
                IsSold = isSold,
                MinPrice = minPrice,
                MaxPrice = maxPrice,
                Category = category
            };
            var items = await itemLogic.GetAsync(parameters);
            Console.WriteLine(items);
            return Ok(items);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("{id:int}")]
    public async Task<ActionResult<Item>> GetItemById([FromRoute] int id)
    {
        try
        {
            Item item = await itemLogic.GetByIdAsync(id);
            return Ok(item);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }


    [HttpPatch("{id:int}")]
    public async Task<ActionResult> UpdateAsync([FromBody] ItemUpdateDto dto)
    {
        try
        {
            Console.WriteLine(JsonSerializer.Serialize(dto));
            await itemLogic.UpdateAsync(dto);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpDelete("{id:int}")]
    public async Task<ActionResult> DeleteItemAsync([FromRoute] int id)
    {
        try
        { 
            await itemLogic.DeleteByIdAsync(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}