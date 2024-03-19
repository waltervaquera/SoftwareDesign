package Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = generateMenu();
        List<Table> tables = generateTables();
        RestaurantManager restaurantManager = new RestaurantManager(menu, tables);

        int choice;
        do {
            showChoices();
            choice = scanner.nextInt();
            System.out.println();
            action(choice, menu, restaurantManager);
        } while (choice != 5);
    }

    private static void action(int choice, Menu menu, RestaurantManager restaurantManager) {
        switch (choice) {
            case 1:
                menu.display();
                break;
            case 2:
                restaurantManager.assignOrderToTable();
                break;
            case 3:
                restaurantManager.showTables();
                break;
            case 4:
                restaurantManager.clearTable();
                break;
            case 5:
                System.out.println("Exiting system...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void showChoices() {
        System.out.println("\nRestaurant Management System");
        System.out.println("1. Display Menu");
        System.out.println("2. Assign Order to Table");
        System.out.println("3. Show All Tables");
        System.out.println("4. Clear Table");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static Menu generateMenu() {
        Menu menu = new Menu();
        menu.addItem(new MenuItem("asado", 8.0));
        menu.addItem(new MenuItem("lomito", 10.0));
        menu.addItem(new MenuItem("pailita", 12.0));
        return menu;
    }

    private static List<Table> generateTables() {
        List<Table> tables = new ArrayList<>();
        tables.add(new Table(1));
        tables.add(new Table(2));
        tables.add(new Table(3));
        tables.add(new Table(4));
        tables.add(new Table(5));
        return tables;
    }
}