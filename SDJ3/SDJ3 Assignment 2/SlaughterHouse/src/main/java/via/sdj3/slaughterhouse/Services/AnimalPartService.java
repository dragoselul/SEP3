package via.sdj3.slaughterhouse.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse.Model.AnimalPart;
import via.sdj3.slaughterhouse.Repositories.AnimalPartRepository;

import java.util.List;

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
}
