package Restaurant;

public class Table {
    private final int tableNumber;
    private Order currentOrder;
    private enum TableStatus {OCCUPIED, VACANT}
    private TableStatus status;


    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        status = TableStatus.VACANT;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void assignOrder(Order order) {
        currentOrder = order;
        status = TableStatus.OCCUPIED;
    }

    public void clearTable() {
        currentOrder = null;
        status = TableStatus.VACANT;
    }

    public void displayTable() {
        System.out.println("Table " + tableNumber + ": " + status);
        if (currentOrder != null) {
            currentOrder.displayOrder();
        }
    }
}
