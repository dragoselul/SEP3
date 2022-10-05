package via.sdj3.slaughterhouse.Model;

import java.util.ArrayList;

public abstract class Package {
    private int packageId;
    private ArrayList<Integer> trayIds;
    private boolean isReturned;

    public Package() {
    }

    public Package(int packageId, ArrayList<Integer> trayIds, boolean isReturned) {
        this.packageId = packageId;
        this.trayIds = trayIds;
        this.isReturned = isReturned;
    }

    public Package(ArrayList<Integer> trayIds, boolean isReturned) {
        this.trayIds = trayIds;
        this.isReturned = isReturned;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public ArrayList<Integer> getTrayIds() {
        return trayIds;
    }

    public void setTrayIds(ArrayList<Integer> trayIds) {
        this.trayIds = trayIds;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
