package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotalBill() {
        double total = 0;
        for (OrderItem item : items){
            total += item.getCost();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("--------------------");
        System.out.println("Order:");
        for (OrderItem item : items) {
            System.out.println("- " + item);
        }
        System.out.println("Total Bill: " + calculateTotalBill() + "Bs");
        System.out.println("--------------------");
    }
}
