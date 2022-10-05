package via.sdj3.slaughterhouse.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse.Model.SamePartPackage;
import via.sdj3.slaughterhouse.Repositories.SamePartPackageRepository;

import java.util.List;
import java.util.Objects;


@Service
public class SamePartPackageService
{

    private final SamePartPackageRepository samePartPackageRepository;

    @Autowired
    public SamePartPackageService(SamePartPackageRepository samePartPackageRepository) {
        this.samePartPackageRepository = samePartPackageRepository;
    }

    public List<SamePartPackage> getSamePartPackages()
    {
        return samePartPackageRepository.findAll();
    }

    public void addSamePartPackage(SamePartPackage samePartPackage)
    {
        if(samePartPackageRepository.existsById(samePartPackage.getPackageId()))
            throw new IllegalArgumentException("Same part package already exists!");
        samePartPackageRepository.save(samePartPackage);
    }

    public void deleteSamePartPackage(int samePartPackageId)
    {
        if (!samePartPackageRepository.existsById(samePartPackageId))
            throw new IllegalArgumentException("Same part package does not exist!");
        samePartPackageRepository.deleteById(samePartPackageId);
    }

    public void updateSamePartPackage(int samePartPackageId, String animalPartType, int numberOfParts)
    {
        SamePartPackage samePartPackage = samePartPackageRepository.findById(samePartPackageId).orElseThrow(()-> new IllegalArgumentException("Same part package does not exist"));
        if (animalPartType!=null && animalPartType.length() > 0 && !Objects.equals(samePartPackage.getAnimalPartType(),animalPartType))
            samePartPackage.setAnimalPartType(animalPartType);
        if (numberOfParts!= 0 && !Objects.equals(samePartPackage.getNumberOfParts(),numberOfParts))
            samePartPackage.setNumberOfParts(numberOfParts);
    }
}
