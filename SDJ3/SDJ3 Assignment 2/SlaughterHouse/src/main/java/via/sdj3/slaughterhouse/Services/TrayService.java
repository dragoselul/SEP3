package via.sdj3.slaughterhouse.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.sdj3.slaughterhouse.Model.Tray;
import via.sdj3.slaughterhouse.Repositories.TrayRepository;

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
    }

    public void deleteTray(int trayId){
        if (!trayRepository.existsById(trayId))
            throw new IllegalArgumentException("Tray does not exist");
        trayRepository.deleteById(trayId);
    }

    public void updateTray(int trayId, int animalPartId, String typeOfPart, double maxCapacity){
        Tray tray = trayRepository.findById(trayId).orElseThrow(()-> new IllegalStateException("Tray does not exist!"));
        if (animalPartId != 0 && animalPartId > 0 && !Objects.equals(tray.getAnimalPartId(), animalPartId))
            tray.setAnimalPartId(animalPartId);

        if (typeOfPart !=null && typeOfPart != tray.getTypeOfPart())
            tray.setTypeOfPart(typeOfPart);

        if (maxCapacity != 0 && maxCapacity != tray.getMaxCapacity())
            tray.setMaxCapacity(maxCapacity);
    }
}
