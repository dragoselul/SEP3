package via.sdj3.slaughterhouse.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.Model.Animal;
import via.sdj3.slaughterhouse.Model.AnimalPart;
import via.sdj3.slaughterhouse.Model.Tray;
import via.sdj3.slaughterhouse.Services.TrayService;

import java.util.List;

@RestController
@RequestMapping(path = "via/sdj3/tray")
public class TrayController{
    private final TrayService trayService;

    @Autowired
    public TrayController(TrayService trayService){
        this.trayService = trayService;
    }

    @PostMapping
    public void addTray(@RequestBody Tray trayId){
        trayService.addTray(trayId);
    }

    @GetMapping
    public List<Tray> getTrays() {
        return trayService.getTrays();
    }


    @DeleteMapping(path = "{trayId}")
    public void deleteTray(@PathVariable("trayId") int trayId){
        trayService.deleteTray(trayId);
    }

    @PutMapping(path = "{trayId}")
    public void updateTray(@PathVariable("trayId") int trayId, @RequestParam(required = false) AnimalPart animalParts, @RequestParam(required = false) String typeOfPart, @RequestParam(required = false) double maxCapacity, @RequestParam(required = false) int packageId){
        trayService.updateTray(trayId, animalParts, typeOfPart, maxCapacity,packageId);
    }

}
