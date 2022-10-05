package via.sdj3.slaughterhouse.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.Model.ReturnPackage;
import via.sdj3.slaughterhouse.Services.ReturnPackageService;

import java.util.List;

@RestController
@RequestMapping(path = "via/sdj3/returnPackage")
public class ReturnPackageController
{
    private final ReturnPackageService returnPackageService;

    @Autowired
    public ReturnPackageController(ReturnPackageService returnPackageService)
    {
        this.returnPackageService = returnPackageService;
    }

    @GetMapping
    public List<ReturnPackage> getReturnPackage()
    {
        return returnPackageService.getReturnPackages();
    }

    @PostMapping
    public void addReturnPackage(@RequestBody ReturnPackage returnPackage)
    {
        returnPackageService.addReturnPackage(returnPackage);
    }

    @DeleteMapping(path = ("{returnPackageId}"))
    public void deleteReturnPackage(@PathVariable("returnPackageId") int returnPackageId)
    {
        returnPackageService.deleteReturnPackage(returnPackageId);
    }

    @PutMapping(path = ("{returnPackageId}"))
    public void updateReturnPackage(@PathVariable("returnPackageId") int returnPackageId, @RequestParam(required = false) String reason)
    {
        returnPackageService.updateReturnPackage(returnPackageId,reason);
    }
}
