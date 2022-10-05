package via.sdj3.slaughterhouse.Model;

public class Tray {
    private int trayId;
    private int animalPartId;
    private String typeOfPart;
    private double maxCapacity;

    public Tray() {
    }

    public Tray(int trayId, int animalPartId, String typeOfPart, double maxCapacity) {
        this.trayId = trayId;
        this.animalPartId = animalPartId;
        this.typeOfPart = typeOfPart;
        this.maxCapacity = maxCapacity;
    }

    public Tray(int animalPartId, String typeOfPart, double maxCapacity) {
        this.animalPartId = animalPartId;
        this.typeOfPart = typeOfPart;
        this.maxCapacity = maxCapacity;
    }

    public int getTrayId() {
        return trayId;
    }

    public void setTrayId(int trayId) {
        this.trayId = trayId;
    }

    public int getAnimalPartId() {
        return animalPartId;
    }

    public void setAnimalPartId(int animalPartId) {
        this.animalPartId = animalPartId;
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
}
