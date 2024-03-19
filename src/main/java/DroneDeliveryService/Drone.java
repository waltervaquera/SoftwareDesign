package DroneDeliveryService;

import java.util.ArrayList;
import java.util.List;

public class Drone {
    String name;
    int maxWeight;
    List<List<Location>> trips;

    public Drone(String name, int maxWeight) {
        this.name = name;
        this.maxWeight = maxWeight;
        this.trips = new ArrayList<>();
    }

    public void addTrip(List<Location> trip) {
        trips.add(trip);
    }

    public void showTrips() {
        System.out.println("Drone: " + name);
        for (int i = 0; i < trips.size(); i++) {
            System.out.println("Trip " + (i + 1));
            System.out.println(trips.get(i));
        }
        System.out.println();
    }
}
