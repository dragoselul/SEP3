package via.sdj3.slaughterhouse.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.Model.AnimalPart;
import via.sdj3.slaughterhouse.Model.Tray;
import via.sdj3.slaughterhouse.Services.AnimalService;
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

    @DeleteMapping(path = "{trayId}")
    public void deleteTray(@PathVariable("trayId") int trayId){
        trayService.deleteTray(trayId);
    }

    @PutMapping(path = "{trayId}")
    public void updateTray(@PathVariable("trayId") int trayId, @RequestParam(required = false) int animalPartId, @RequestParam(required = false) String typeOfPart, @RequestParam(required = false) double maxCapacity){
        trayService.updateTray(trayId, animalPartId, typeOfPart, maxCapacity);
    }

}
