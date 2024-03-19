package DroneDeliveryService;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {
    public List<Drone> readDrones() {
        Scanner scanner = new Scanner(System.in);
        List<Drone> drones = new ArrayList<>();
        System.out.println("Enter drone details (name, max weight), type 'done' to finish:");

        while (drones.size() <= 100) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String[] parts = input.split(",");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please provide name and max weight separated by comma.");
                continue;
            }

            String name = parts[0].trim();
            int maxWeight;
            try {
                maxWeight = Integer.parseInt(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for max weight. Please provide a valid integer.");
                continue;
            }

            drones.add(new Drone(name, maxWeight));
        }
        return drones;
    }

    public List<Location> readLocations() {
        Scanner scanner = new Scanner(System.in);
        List<Location> locations = new ArrayList<>();
        System.out.println("Enter location details (name, package weight), type 'done' to finish:");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String[] parts = input.split(",");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please provide name and package weight separated by comma.");
                continue;
            }

            String name = parts[0].trim();
            int packageWeight;
            try {
                packageWeight = Integer.parseInt(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for package weight. Please provide a valid integer.");
                continue;
            }

            locations.add(new Location(name, packageWeight));
        }
        return locations;
    }

}
