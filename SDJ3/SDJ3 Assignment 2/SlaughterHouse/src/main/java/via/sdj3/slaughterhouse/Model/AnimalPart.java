package via.sdj3.slaughterhouse.Model;

import javax.persistence.*;

@Entity
@Table(name = "AnimalParts")
public class AnimalPart {
    @Id
    @SequenceGenerator(
            name = "animal_sequnce",
            sequenceName = "animal_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "animal_sequence"
    )
    private int animalPartId;
    private String animalType;
    private double weight;

    public AnimalPart() {
    }

    public AnimalPart(int animalPartId, String animalType, double weight) {
        this.animalPartId = animalPartId;
        this.animalType = animalType;
        this.weight = weight;
    }

    public AnimalPart(String animalType, double weight) {
        this.animalType = animalType;
        this.weight = weight;
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
}
