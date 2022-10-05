package via.sdj3.slaughterhouse.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import via.sdj3.slaughterhouse.Model.Animal;
import via.sdj3.slaughterhouse.Model.AnimalPart;
import via.sdj3.slaughterhouse.Repositories.AnimalRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }

    public void addAnimal(Animal animal) {
        if(animalRepository.existsById(animal.getId()))
            throw new IllegalArgumentException("Animal already exists!");
        animalRepository.save(animal);
    }

    public void deleteAnimal(int animalId) {
        if(!animalRepository.existsById(animalId))
            throw new IllegalArgumentException("Animal does not exist!");
        animalRepository.deleteById(animalId);
    }

    @Transactional
    public void updateAnimal(int animalId, String species, double weight, ArrayList<AnimalPart> parts) {
        Animal animal = animalRepository.findById(animalId).orElseThrow(()-> new IllegalStateException("Animal does not exist"));
        if(species!=null && species.length() > 0 && !Objects.equals(animal.getSpecies(),species))
            animal.setSpecies(species);
        if(weight !=0 && weight != animal.getWeight())
            animal.setWeight(weight);
        if(parts != null && parts.size()>0 && Objects.equals(parts,animal.getParts()))
            animal.setParts(parts);
    }
}
