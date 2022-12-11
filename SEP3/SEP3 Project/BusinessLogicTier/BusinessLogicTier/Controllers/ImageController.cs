using Application.LogicInterfaces;
using Domain.DTOs;
using gRPCClient;
using Microsoft.AspNetCore.Mvc;
using Image = Domain.Models.Image;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class ImageController : ControllerBase
{
    private readonly IImageLogic ImageLogic;

    public ImageController(IImageLogic imageLogic)
    {
        ImageLogic = imageLogic;
    }

    [HttpPost ("/image")]
    public async Task<ActionResult<Image>> UploadImage([FromBody] ImageCreationDto dto)
    {
        try
        {
            Image uploaded = await ImageLogic.UploadImage(dto);
            return Created($"/image/{uploaded.Id}", uploaded);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet("/item/images/{id:int}")]
    public async Task<ActionResult<List<Image>>> GetImagesByItemId([FromRoute] int id)
    {
        try
        {
            List<Image> images = await ImageLogic.GetImagesByItemId(id);
            return Ok(images);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpGet("{id:int}")]
    public async Task<ActionResult<Image>> GetImageById([FromRoute] int id)
    {
        try
        {
            Image image = await ImageLogic.GetImageById(id);
            return Ok(image);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [HttpDelete("{id:int}")]
    public async Task<ActionResult> DeleteImageAsync([FromRoute] int id)
    {
        try
        { 
            await ImageLogic.DeleteImageById(id);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}