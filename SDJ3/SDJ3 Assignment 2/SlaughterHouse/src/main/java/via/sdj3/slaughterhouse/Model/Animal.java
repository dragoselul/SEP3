package via.sdj3.slaughterhouse.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "Animals")
public class Animal {
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
    private int id;
    private String species;
    private double weight;

    private String origin;

    private LocalDate doa;
    @Transient
    private ArrayList<AnimalPart> parts;

    public Animal() {
    }

    public Animal(int id, String species, double weight, ArrayList<AnimalPart> parts, String origin, LocalDate doa) {
        this.id = id;
        this.species = species;
        this.weight = weight;
        this.parts = parts;
        this.origin = origin;
        this.doa = doa;
    }

    public Animal(String species, double weight, ArrayList<AnimalPart> parts, String origin, LocalDate doa) {
        this.species = species;
        this.weight = weight;
        this.parts = parts;
        this.doa = doa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ArrayList<AnimalPart> getParts() {
        return parts;
    }

    public void setParts(ArrayList<AnimalPart> parts) {
        this.parts = parts;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDate getDoa() {
        return doa;
    }

    public void setDoa(LocalDate doa) {
        this.doa = doa;
    }
}
