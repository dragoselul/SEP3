package via.sdj3.slaughterhouse.Model;

import java.util.ArrayList;

public class HalfAnimalPackage extends Package{
    public HalfAnimalPackage() {
    }

    public HalfAnimalPackage(int packageId, ArrayList<Integer> trayIds, boolean isReturned) {
        super(packageId, trayIds, isReturned);
    }

    public HalfAnimalPackage(ArrayList<Integer> trayIds, boolean isReturned) {
        super(trayIds, isReturned);
    }
}
