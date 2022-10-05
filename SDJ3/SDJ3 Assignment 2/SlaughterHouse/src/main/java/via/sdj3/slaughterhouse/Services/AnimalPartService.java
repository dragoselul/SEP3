package via.sdj3.slaughterhouse.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse.Model.AnimalPart;
import via.sdj3.slaughterhouse.Repositories.AnimalPartRepository;

import java.util.List;
import java.util.Objects;

@Service
public class AnimalPartService
{
    private final AnimalPartRepository animalPartRepository;

    @Autowired
    public AnimalPartService(AnimalPartRepository animalPartRepository)
    {
        this.animalPartRepository = animalPartRepository;
    }

    public List<AnimalPart> getAnimalParts()
    {
        return animalPartRepository.findAll();
    }

    public void addAnimalPart(AnimalPart animalPart)
    {
        if (animalPartRepository.existsById(animalPart.getAnimalPartId()))
            throw new IllegalArgumentException("Animal part already exists");
        animalPartRepository.save(animalPart);
    }

    public void deleteAnimalPart(int animalPartId)
    {
        if(!animalPartRepository.existsById(animalPartId))
            throw new IllegalArgumentException("Animal part does not exist");
        animalPartRepository.deleteById(animalPartId);
    }

    public void updateAnimalPart(int animalPartId, String animalType, double weight )
    {
        AnimalPart animalpart = animalPartRepository.findById(animalPartId).orElseThrow(() -> new IllegalArgumentException("Animal part does not exist"));
        if (animalType!=null && animalType.length() > 0 && !Objects.equals(animalpart.getAnimalType(),animalType))
            animalpart.setAnimalType(animalType);
        if (weight > 0 && !Objects.equals(animalpart.getWeight(),weight))
            animalpart.setWeight(weight);
    }
}
