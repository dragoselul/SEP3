package via.sdj3.slaughterhouse.Model;

public class ReturnPackage {
    private int packageIDs;
    private String reason;

    public ReturnPackage() {
    }

    public ReturnPackage(int packageIDs, String reason) {
        this.packageIDs = packageIDs;
        this.reason = reason;
    }

    public ReturnPackage(String reason) {
        this.reason = reason;
    }

    public int getPackageIDs() {
        return packageIDs;
    }

    public void setPackageIDs(int packageIDs) {
        this.packageIDs = packageIDs;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
