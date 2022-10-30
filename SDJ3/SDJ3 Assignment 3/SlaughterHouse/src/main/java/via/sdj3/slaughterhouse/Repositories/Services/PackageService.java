package via.sdj3.slaughterhouse.Repositories.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse.Model.Package;
import via.sdj3.slaughterhouse.Repositories.PackageRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PackageService{

    private final PackageRepository packageRepository;

    @Autowired
    public PackageService(PackageRepository packageRepository){
        this.packageRepository = packageRepository;
    }

    public List<Package> getPackage(){
        return packageRepository.findAll();
    }

    public void addPackage(Package packages){
        if (packageRepository.existsById(packages.getPackageId()))
            throw new IllegalArgumentException("Package already exists!");
        packageRepository.save(packages);
    }

    public void deletePackage(int packageId){
        if (!packageRepository.existsById(packageId))
            throw new IllegalArgumentException("Package does not exist!");
        packageRepository.deleteById(packageId);
    }

    public void updatePackage(int packageId, boolean isReturned){
        Package packages = packageRepository.findById(packageId).orElseThrow(()-> new IllegalStateException("Package does not exist"));
        if (isReturned != true && Objects.equals(isReturned, packages.isReturned()))
            packages.isReturned();
    }
}
