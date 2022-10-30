package via.sdj3.slaughterhouse.Model;

import javax.persistence.*;

@Entity
@Table(name = "AnimalParts")
public class AnimalPart {
    @Id
    @SequenceGenerator(
            name = "animalPart_sequnce",
            sequenceName = "animalPart_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "animalPart_sequence"
    )
    private int animalPartId;
    private String animalType;
    private double weight;
    private String partDescription;
    private int animalProviderId;
    private int trayId;

    public AnimalPart() {
    }

    public AnimalPart(int animalPartId, String animalType, double weight, String partDescription, int animalProviderId, int trayId) {
        this.animalPartId = animalPartId;
        this.animalType = animalType;
        this.weight = weight;
        this.partDescription = partDescription;
        this.animalProviderId = animalProviderId;
        this.trayId = trayId;
    }

    public AnimalPart(String animalType, double weight, String partDescription, int animalProviderId, int trayId) {
        this.animalType = animalType;
        this.weight = weight;
        this.partDescription = partDescription;
        this.animalProviderId = animalProviderId;
        this.trayId = trayId;
    }

    public int getAnimalPartId() {
        return animalPartId;
    }

    public void setAnimalPartId(int animalPartId) {
        this.animalPartId = animalPartId;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getAnimalProviderId() {
        return animalProviderId;
    }
    public void setAnimalProviderId(int animalProviderId)
    {
        this.animalProviderId = animalProviderId;
    }

    public int getTrayId() {
        return trayId;
    }
    public void setTrayId(int trayId)
    {
        this.trayId = trayId;
    }
}
