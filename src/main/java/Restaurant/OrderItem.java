package Restaurant;

public class OrderItem {
    private MenuItem menuItem;
    private Double cost;
    private String specialRequest;

    public OrderItem(MenuItem menuItem, String specialRequest) {
        this.menuItem = menuItem;
        this.cost = menuItem.getPrice();
        this.specialRequest = specialRequest;
    }

    public Double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return menuItem.getName() + " " + specialRequest;
    }
}
