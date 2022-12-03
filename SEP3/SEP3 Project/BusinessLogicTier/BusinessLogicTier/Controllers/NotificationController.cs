using Application.LogicInterfaces;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class NotificationController : ControllerBase
{
    private readonly INotificationLogic notificationLogic;

    public NotificationController(INotificationLogic notificationLogic)
    {
        this.notificationLogic = notificationLogic;
    }

    [HttpGet]
    public async Task<ActionResult<List<Notification>>> GetAsync([FromQuery] int ownerId)
    {
        try
        {
            var notifications = await notificationLogic.GetNotificationsByUserId(ownerId);
            return Ok(notifications);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpDelete("{id:int}")]
    public Task<ActionResult> DeleteNotificationAsync([FromRoute] int id)
    {
        try
        { 
            notificationLogic.DeleteNotificationById(id);
            return Task.FromResult<ActionResult>(Ok());
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return Task.FromResult<ActionResult>(StatusCode(500, e.Message));
        }
    }
    
    [HttpDelete]
    public Task<ActionResult> DeleteNotificationsByOwnerAsync([FromQuery] int ownerId)
    {
        try
        { 
            notificationLogic.DeleteNotificationsByUserId(ownerId);
            return Task.FromResult<ActionResult>(Ok());
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return Task.FromResult<ActionResult>(StatusCode(500, e.Message));
        }
    }
    
    
}