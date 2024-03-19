package DroneDeliveryService;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        TripsPlanner tripsPlanner = new TripsPlanner();

        List<Drone> drones = inputReader.readDrones();
        List<Location> locations = inputReader.readLocations();
        locations.sort(Comparator.comparingInt(Location::getPackageWeight));

        tripsPlanner.planTrips(drones, locations);

        for (Drone drone : drones) {
            drone.showTrips();
        }
    }
}
