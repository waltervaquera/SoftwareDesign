package DroneDeliveryService;

import java.util.ArrayList;
import java.util.List;

public class TripsPlanner {
    public void planTrips(List<Drone> drones, List<Location> locations) {
        List<Location> remainingLocations = new ArrayList<>(locations);

        while (!remainingLocations.isEmpty()) {
            for (Drone drone : drones) {
                List<Location> currentTrip = new ArrayList<>();
                int currentWeight = 0;

                for (int i = 0; i < remainingLocations.size(); i++) {
                    Location location = remainingLocations.get(i);
                    if (currentWeight + location.getPackageWeight() <= drone.maxWeight) {
                        currentTrip.add(location);
                        currentWeight += location.getPackageWeight();
                        remainingLocations.remove(location);
                        i--;
                    }
                }

                if (!currentTrip.isEmpty()) {
                    drone.addTrip(currentTrip);
                }
            }
        }
    }
}
