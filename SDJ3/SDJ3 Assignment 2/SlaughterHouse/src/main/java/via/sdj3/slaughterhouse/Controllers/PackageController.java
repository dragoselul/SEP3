package via.sdj3.slaughterhouse.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.Model.Package;
import via.sdj3.slaughterhouse.Services.PackageService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "via/sdj3/package")
public class PackageController{
    private final PackageService packageService;

    @Autowired
    public PackageController(PackageService packageService) {
        this.packageService = packageService;
    }

    @GetMapping
    public List<Package> getPackage(){
        return packageService.getPackage();
    }

    @PostMapping
    public void addPackage(@RequestBody Package packages){
        packageService.addPackage(packages);
    }

    @DeleteMapping(path = "{packageId}")
    public void deletePackage(@PathVariable("packageId") int packageId){
        packageService.deletePackage(packageId);
    }

    @PutMapping(path = "{packageId}")
    public void updatePackage(@PathVariable("packageId") int packageId, @RequestParam(required = false) ArrayList<Integer> trayIds, @RequestParam(required = false) boolean isReturned){
        packageService.updatePackage(packageId, trayIds, isReturned);
    }
}
