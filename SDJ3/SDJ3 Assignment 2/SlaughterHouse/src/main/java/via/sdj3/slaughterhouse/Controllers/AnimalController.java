package via.sdj3.slaughterhouse.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import via.sdj3.slaughterhouse.Model.Animal;
import via.sdj3.slaughterhouse.Model.AnimalPart;
import via.sdj3.slaughterhouse.Services.AnimalService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "via/sdj3/animal")
public class AnimalController {
    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> getAnimal() {
        return animalService.getAnimals();
    }

    @PostMapping
    public void addAnimal(@RequestBody Animal animal) {
        animalService.addAnimal(animal);
    }

    @DeleteMapping(path = "{animalId}")
    public void deleteAnimal(@PathVariable("animalId") int animalId) {
        animalService.deleteAnimal(animalId);
    }

    @PutMapping(path = "{animalId}")
    public void updateAnimal(@PathVariable("animalId") int animalId, @RequestParam(required = false) String species, @RequestParam(required = false) double weight, @RequestParam(required = false) ArrayList<AnimalPart> parts){
        animalService.updateAnimal(animalId,species,weight,parts);
    }
}
