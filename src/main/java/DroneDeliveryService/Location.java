package DroneDeliveryService;

public class Location {
    String name;
    int packageWeight;

    public Location(String name, int packageWeight) {
        this.name = name;
        this.packageWeight = packageWeight;
    }

    public int getPackageWeight() {
        return packageWeight;
    }

    @Override
    public String toString() {
        return name + ": " + packageWeight;
    }
}
