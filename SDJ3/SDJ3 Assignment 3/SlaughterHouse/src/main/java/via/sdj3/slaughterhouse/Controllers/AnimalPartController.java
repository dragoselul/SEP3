package via.sdj3.slaughterhouse.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.Model.AnimalPart;
import via.sdj3.slaughterhouse.Repositories.Services.AnimalPartService;

import java.util.List;

@RestController
@RequestMapping(path = "via/sdj3/animalPart")
public class AnimalPartController {

    private final AnimalPartService animalPartService;

    @Autowired
    public AnimalPartController(AnimalPartService animalPartService)
    {
        this.animalPartService = animalPartService;
    }

    @GetMapping
    public List<AnimalPart> getAnimalPart()
    {
        return animalPartService.getAnimalParts();
    }

    @PostMapping
    public void addAnimalPart(@RequestBody AnimalPart animalPart)
    {
        animalPartService.addAnimalPart(animalPart);
    }

    @DeleteMapping(path = "{animalPartId}")
    public void deleteAnimalPart(@PathVariable("animalPartId") int animalPartId)
    {
        animalPartService.deleteAnimalPart(animalPartId);
    }

    @PutMapping(path = "{animalPartId}")
    public void updateAnimalPart(@PathVariable("animalPartId") int animalPartId, @RequestParam(required = false) String animalType, @RequestParam(required = false) double weight, @RequestParam(required = false) String partDescription,@RequestParam(required = false) int animalProviderId, @RequestParam(required = false) int trayId)
    {
        animalPartService.updateAnimalPart(animalPartId,animalType,weight,partDescription, animalProviderId, trayId);
    }
}
