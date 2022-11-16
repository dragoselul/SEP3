﻿using Application.LogicInterfaces;
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
    
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Item>>> GetAsync([FromQuery] string? firstName,
        [FromQuery] string? lastName, [FromQuery] string? name, [FromQuery]  string? description,
        [FromQuery] int contactId, [FromQuery] double pricing, [FromQuery] bool isSold)
    {
        try
        {
            SearchItemParametersDto parameters = new(firstName, lastName, name, description, contactId, pricing, isSold);
            var todos = await todoLogic.GetAsync(parameters);
            return Ok(todos);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    
    [HttpPatch]
    public async Task<ActionResult> UpdateAsync([FromBody] ItemUpdateDto dto)
    {
        try
        {
            await todoLogic.UpdateAsync(dto);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}