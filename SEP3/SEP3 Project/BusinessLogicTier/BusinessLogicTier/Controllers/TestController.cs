using System.Security.Claims;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
[Authorize]
public class TestController : ControllerBase
{
    [HttpGet("authorized")]
    public ActionResult GetAsAuthorized()
    {
        return Ok("This was accepted as authorized");
    }
    [HttpGet("allowanon"), AllowAnonymous]
    public ActionResult GetAsAnon()
    {
        return Ok("This was accepted as anonymous");
    }
    [HttpGet("mustbeBuyer"), Authorize("MustBeBuyer")]
    public ActionResult GetAsBuyer()
    {
        return Ok("This was accepted as buyer domain");
    }
    [HttpGet("manualcheck")]
    public ActionResult GetWithManualCheck()
    {
        Claim? claim = User.Claims.FirstOrDefault(claim => claim.Type.Equals(ClaimTypes.Role));
        if (claim == null)
        {
            return StatusCode(403, "You have no role");
        }

        if (!claim.Value.Equals("Seller"))
        {
            return StatusCode(403, "You are not a seller");
        }

        return Ok("You are a Seller, you may proceed");
    }
}