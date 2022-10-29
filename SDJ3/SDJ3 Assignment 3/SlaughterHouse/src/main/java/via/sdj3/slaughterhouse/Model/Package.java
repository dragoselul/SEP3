package via.sdj3.slaughterhouse.Model;

import javax.persistence.*;
import java.util.ArrayList;
@Entity
@Table(name="Packages")
public abstract class Package {
    @Id
    @SequenceGenerator(
            name = "package_sequnce",
            sequenceName = "package_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "package_sequence"
    )
    private int packageId;
    private boolean isReturned;
    @Transient
    private ArrayList<Integer> trayIds;

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
