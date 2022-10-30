package via.sdj3.slaughterhouse.Model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Trays")
public class Tray {
    @Id
    @SequenceGenerator(
            name = "tray_sequnce",
            sequenceName = "tray_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tray_sequence"
    )
    private int trayId;
    private String typeOfPart;
    private double maxCapacity;

    private int packageId;
    @Transient
    private ArrayList<AnimalPart> animalParts;

    public Tray() {
    }

    public Tray(int trayId, ArrayList<AnimalPart> animalParts, String typeOfPart, double maxCapacity, int packageId) {
        this.trayId = trayId;
        this.animalParts = animalParts;
        this.typeOfPart = typeOfPart;
        this.maxCapacity = maxCapacity;
        this.packageId = packageId;
    }

    public Tray(ArrayList<AnimalPart> animalParts, String typeOfPart, double maxCapacity, int packageId) {
        this.animalParts = animalParts;
        this.typeOfPart = typeOfPart;
        this.maxCapacity = maxCapacity;
        this.packageId = packageId;
    }

    public int getTrayId() {
        return trayId;
    }

    public void setTrayId(int trayId) {
        this.trayId = trayId;
    }

    public ArrayList<AnimalPart> getAnimalParts() {
        return animalParts;
    }

    public void editAnimalPart(AnimalPart animalPart) {
        animalParts.remove(animalPart);
        animalParts.add(animalPart);
    }

    public boolean animalPartsContains(AnimalPart animalPart) {
        return animalParts.contains(animalPart);
    }
    public void setAnimalParts(ArrayList<AnimalPart> animalParts) {
        this.animalParts = animalParts;
    }

    public String getTypeOfPart() {
        return typeOfPart;
    }

    public void setTypeOfPart(String typeOfPart) {
        this.typeOfPart = typeOfPart;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }
}
