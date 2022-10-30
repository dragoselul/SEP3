package via.sdj3.slaughterhouse.Model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse.Interface.SlaughterHouse;
import via.sdj3.slaughterhouse.Services.AnimalPartService;
import via.sdj3.slaughterhouse.Services.AnimalService;
import via.sdj3.slaughterhouse.Services.PackageService;
import via.sdj3.slaughterhouse.Services.TrayService;
import via.sdj3.slaughterhouse.protobuf.Animal;
import via.sdj3.slaughterhouse.protobuf.Package;
import via.sdj3.slaughterhouse.protobuf.Packages;
import via.sdj3.slaughterhouse.protobuf.RegistrationNumbers;
import java.util.ArrayList;

@Service
public class RemoteSlaughterHouse implements SlaughterHouse {

    private AnimalService animalService;
    private AnimalPartService animalPartService;
    private PackageService packageService;
    private TrayService trayService;

    @Autowired
    public RemoteSlaughterHouse(AnimalService animalService, AnimalPartService animalPartService, PackageService packageService, TrayService trayService) {
        this.animalService = animalService;
        this.animalPartService = animalPartService;
        this.packageService = packageService;
        this.trayService = trayService;
    }

    @Override
    public RegistrationNumbers retrieveRegNumber(Package pack) {
        RegistrationNumbers registrationNumbers = RegistrationNumbers.newBuilder().build();
        int[] traysInsidePackage = new int[trayService.getTrays().size()];
        int j = 0;
        for (int i = 0; i < trayService.getTrays().size(); i++) {
            int trayPackageId = trayService.getTrays().get(i).getPackageId();
            if(trayPackageId == pack.getPackageId()) {
                traysInsidePackage[j] = trayPackageId;
                j++;
            }
        }
        AnimalPart animalPart;
        int l = 0;
        for (int i = 0; i < animalPartService.getAnimalParts().size(); i++) {
            animalPart = animalPartService.getAnimalParts().get(i);
            for (int k = 0; k < j; k++) {
                if(animalPart.getTrayId() == traysInsidePackage[k]) {
                    registrationNumbers = RegistrationNumbers.newBuilder().setAnimalRegNumbers(l,animalPart.getAnimalProviderId()).build();
                    l++;
                }
            }
        }
    return registrationNumbers;
    }

    @Override
    public Packages retrievePackage(Animal animal) {
        Packages packages = Packages.newBuilder().build();
        ArrayList<Integer> trays = new ArrayList<>();
        for (int i = 0; i < animalPartService.getAnimalParts().size(); i++) {
            AnimalPart part = animalPartService.getAnimalParts().get(i);
            if(part.getAnimalProviderId() == animal.getId())
                trays.add(part.getTrayId());
        }
        ArrayList<Integer> packagesids = new ArrayList<>();
        List<Package> packageList = new ArrayList<>();
        for (int i = 0; i < trays.size(); i++) {
            int traysId = trays.get(i);
            int packageid = trayService.getTrays().get(traysId-1).getPackageId();
            int packId = packageService.getPackage().get(packageid-1).getPackageId();
            boolean packReturned = packageService.getPackage().get(packageid-1).isReturned();
            if(!packagesids.contains(packageid)) {
                packagesids.add(packageid);
                Package packa = Package.newBuilder().setPackageId(packId).setIsReturned(packReturned).build();
                packageList.add(packa);
            }
        }
        packages = Packages.newBuilder().addAllPackages(packageList).build();
        return packages;
    }
}
