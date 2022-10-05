package via.sdj3.slaughterhouse.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.Model.AnimalPart;
import via.sdj3.slaughterhouse.Model.Tray;
import via.sdj3.slaughterhouse.Services.AnimalService;

import java.util.List;

@RestController
@RequestMapping(path = "via/sdj3/tray")
public class TrayController{
    private final AnimalService animalService;

    @Autowired
    public TrayController(AnimalService animalService){
        this.animalService = animalService;
    }

    @GetMapping
    public List<AnimalPart> getAnimalPart(){
        return animalService.getAnimalPart;
    }

    @PostMapping
    public void addTray(@RequestBody Tray trayId){
        animalService.addTray(animalPart);
    }

    @DeleteMapping(path = "{trayId}")
    public void deleteTray(@PathVariable("trayId") int trayId){
        animalService.deleteTray(trayId);
    }

    @PutMapping(path = "{trayId}")
    public void updateTray(@PathVariable("trayId") int trayId, @RequestParam(required = false) int animalPartId, @RequestParam(required = false) String typeOfPart, @RequestParam(required = false) double maxCapacity){
        animalService.updateTray(trayId, animalPartId, typeOfPart, maxCapacity);
    }

}
