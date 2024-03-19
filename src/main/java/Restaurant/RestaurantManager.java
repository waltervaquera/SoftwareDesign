package Restaurant;

import java.util.*;

public class RestaurantManager {
    private final Menu menu;
    private final List<Table> tables;

    public RestaurantManager(Menu menu, List<Table> tables) {
        this.menu = menu;
        this.tables = tables;
    }

    public Order takeOrder() {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        while (true) {
            System.out.print("Enter menu item name (or 'done' to finish): ");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("done")) {
                break;
            }

            MenuItem item = menu.getItemByName(itemName);

            if (item != null) {
                System.out.print("Special request (if any): ");
                String specialRequest = scanner.nextLine();
                order.addItem(new OrderItem(item, specialRequest));
            } else {
                System.out.println("Item not found in the menu.");
            }
        }
        return order;
    }


    public void assignOrderToTable() {
        Scanner scanner = new Scanner(System.in);
        Order order = takeOrder();

        if (order != null) {
            System.out.print("Assign the order to a table, Enter table number: ");
            int tableNumber = scanner.nextInt();

            assignOrderToTableAuxiliary(tableNumber, order);
        } else {
            System.out.println("Order could not be created.");
        }
    }

    private void assignOrderToTableAuxiliary(int tableNumber, Order order) {
        boolean found = false;

        for (Table table : tables) {
            if (table.getTableNumber() == tableNumber) {
                table.assignOrder(order);
                System.out.println("Order assigned to table " + tableNumber);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("table not found.");
        }
    }

    public void clearTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter table number to clear: ");
        int tableNumber = scanner.nextInt();

        clearTableAuxiliary(tableNumber);
    }

    private void clearTableAuxiliary(int tableNumber) {
        boolean found = false;

        for (Table table : tables) {
            if (table.getTableNumber() == tableNumber) {
                table.clearTable();
                System.out.println("Table " + tableNumber + " cleared.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("table not found.");
        }
    }

    public void showTables() {
        System.out.println("Restaurant Tables");
        for (Table table : tables) {
            table.displayTable();
        }
    }
}
