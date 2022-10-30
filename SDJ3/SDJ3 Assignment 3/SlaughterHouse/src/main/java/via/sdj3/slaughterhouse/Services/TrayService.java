package via.sdj3.slaughterhouse.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse.Model.Animal;
import via.sdj3.slaughterhouse.Model.AnimalPart;
import via.sdj3.slaughterhouse.Model.Tray;
import via.sdj3.slaughterhouse.Repositories.TrayRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TrayService{

    private final TrayRepository trayRepository;

    @Autowired
    public TrayService (TrayRepository trayRepository){
        this.trayRepository = trayRepository;
    }

    public void addTray(Tray tray){
        if (trayRepository.existsById(tray.getTrayId()))
            throw new IllegalArgumentException("Tray already exist!");
        trayRepository.save(tray);
    }

    public List<Tray> getTrays() {
        return trayRepository.findAll();
    }

    public void deleteTray(int trayId){
        if (!trayRepository.existsById(trayId))
            throw new IllegalArgumentException("Tray does not exist");
        trayRepository.deleteById(trayId);
    }

    public void updateTray(int trayId, AnimalPart animalPart, String typeOfPart, double maxCapacity, int packageId){
        Tray tray = trayRepository.findById(trayId).orElseThrow(()-> new IllegalStateException("Tray does not exist!"));
        if (animalPart != null &&  !Objects.equals(tray.animalPartsContains(animalPart), true))
            tray.editAnimalPart(animalPart);

        if (typeOfPart !=null && typeOfPart != tray.getTypeOfPart())
            tray.setTypeOfPart(typeOfPart);

        if (maxCapacity != 0 && maxCapacity != tray.getMaxCapacity())
            tray.setMaxCapacity(maxCapacity);
        if(packageId !=0 && packageId != tray.getPackageId()) {
            tray.setPackageId(packageId);
        }
    }
}
