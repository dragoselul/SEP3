package via.sdj3.slaughterhouse.Repositories.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse.Model.ReturnPackage;
import via.sdj3.slaughterhouse.Repositories.ReturnPackageRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class ReturnPackageService
{
    private final ReturnPackageRepository returnPackageRepository;

    @Autowired
    public ReturnPackageService(ReturnPackageRepository returnPackageRepository) {
        this.returnPackageRepository = returnPackageRepository;
    }

    public List<ReturnPackage> getReturnPackages()
    {
        return returnPackageRepository.findAll();
    }

    public void addReturnPackage(ReturnPackage returnPackage)
    {
        if (returnPackageRepository.existsById(returnPackage.getPackageIDs()))
            throw new IllegalArgumentException("Returned package already exists");
        returnPackageRepository.save(returnPackage);
    }

    public void deleteReturnPackage(int returnPackageId)
    {
        if (!returnPackageRepository.existsById(returnPackageId))
            throw new IllegalArgumentException("Returned package does not exists");
        returnPackageRepository.deleteById(returnPackageId);
    }

    @Transactional
    public void updateReturnPackage(int returnPackageId, String reason)
    {
        ReturnPackage returnPackage = returnPackageRepository.findById(returnPackageId).orElseThrow(()-> new IllegalArgumentException("Returned package does not exist"));
        if (reason!=null && reason.length() > 0 && !Objects.equals(returnPackage.getReason(),reason))
            returnPackage.setReason(reason);
    }
}
