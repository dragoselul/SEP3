package via.sdj3.slaughterhouse.Model;

import java.util.ArrayList;

public class SamePartPackage extends Package{
    private String animalPartType;
    private int numberOfParts;

    public SamePartPackage(String animalPartType, int numberOfParts) {
        this.animalPartType = animalPartType;
        this.numberOfParts = numberOfParts;
    }

    public SamePartPackage(int packageId, ArrayList<Integer> trayIds, boolean isReturned, String animalPartType, int numberOfParts) {
        super(packageId, trayIds, isReturned);
        this.animalPartType = animalPartType;
        this.numberOfParts = numberOfParts;
    }

    public SamePartPackage(ArrayList<Integer> trayIds, boolean isReturned, String animalPartType, int numberOfParts) {
        super(trayIds, isReturned);
        this.animalPartType = animalPartType;
        this.numberOfParts = numberOfParts;
    }

    public String getAnimalPartType() {
        return animalPartType;
    }

    public void setAnimalPartType(String animalPartType) {
        this.animalPartType = animalPartType;
    }

    public int getNumberOfParts() {
        return numberOfParts;
    }

    public void setNumberOfParts(int numberOfParts) {
        this.numberOfParts = numberOfParts;
    }
}
