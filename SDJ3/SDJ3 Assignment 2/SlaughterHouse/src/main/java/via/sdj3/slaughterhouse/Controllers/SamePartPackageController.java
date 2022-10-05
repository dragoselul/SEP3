package via.sdj3.slaughterhouse.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.Model.SamePartPackage;
import via.sdj3.slaughterhouse.Services.SamePartPackageService;

import java.util.List;

@RestController
@RequestMapping(path = "via/sdj3/samePartPackage")
public class SamePartPackageController
{
    private final SamePartPackageService samePartPackageService;

    @Autowired
    public SamePartPackageController(SamePartPackageService samePartPackageService) {
        this.samePartPackageService = samePartPackageService;
    }

    @PutMapping
    public List<SamePartPackage> getSamePartPackage()
    {
        return samePartPackageService.getSamePartPackages();
    }

    @PostMapping
    public void addSamePartPackage(@RequestBody SamePartPackage samePartPackage)
    {
        samePartPackageService.addSamePartPackage(samePartPackage);
    }

    @DeleteMapping(path = "{samePartPackageId}")
    public void deleteSamePartPackage(@PathVariable("samePartPackageId") int samePartPackageId)
    {
        samePartPackageService.deleteSamePartPackage(samePartPackageId);
    }

    @PutMapping(path = "{samePartPackageId}")
    public void updateSamePartPackage(@PathVariable("samePartPackageId") int samePartPackageId, @RequestParam(required = false) String animalPartType, @RequestParam(required = false) int numberOfParts)
    {
        samePartPackageService.updateSamePartPackage(samePartPackageId,animalPartType,numberOfParts);
    }
}
