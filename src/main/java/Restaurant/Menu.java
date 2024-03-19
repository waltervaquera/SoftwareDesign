package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> items = new ArrayList<>();

    public void display() {
        System.out.println("Restaurant Menu");
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public MenuItem getItemByName(String name) {
        for (MenuItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public void modifyItemPrize(String name, Double newPrice) {
        MenuItem item = getItemByName(name);
        if (item != null) {
            item.setPrice(newPrice);
        } else {
            System.out.println("Item '" + name + "' does not exist in the menu.");
        }
    }
}
