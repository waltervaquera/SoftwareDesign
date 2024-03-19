package ProductsSales;

import java.util.Scanner;

public class InputReader {
    public Product readProduct() {
        Scanner scanner = new Scanner(System.in);

        displayProductsMenu();
        return readProductChoice(scanner.nextInt());
    }

    private void displayProductsMenu() {
        System.out.println("Select a Product.");
        System.out.println("1: Apple 1Bs (10 in stock)");
        System.out.println("2: Orange 2Bs (20 in stock)");
        System.out.println("3: Banana 3BS (30 in stock)");
        System.out.println("4: Lemon 4Bs (40 in stock)");
        System.out.println("5: Kiwi 5Bs (50 in stock)");
        System.out.print("Enter a choice: ");
    }

    private Product readProductChoice(int choice) {
        return switch (choice) {
            case 1 -> new Product("apple", 1.0, 10);
            case 2 -> new Product("orange", 2.0, 20);
            case 3 -> new Product("banana", 3.0, 30);
            case 4 -> new Product("lemon", 4.0, 40);
            case 5 -> new Product("kiwi", 5.0, 50);
            default -> null;
        };
    }

    public int readSaleQuantity() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Sale Quantity: ");
        return scanner.nextInt();
    }

    public ISaleMethod readSaleMethod() {
        Scanner scanner = new Scanner(System.in);

        displaySaleMethodMenu();
        return readSaleMethodChoice(scanner.nextInt());
    }

    private void displaySaleMethodMenu() {
        System.out.println("\nSelect a Method of Sale.");
        System.out.println("1: Sale by Unit.");
        System.out.println("2: Sale by Dozen.");
        System.out.print("Enter a choice: ");
    }

    private ISaleMethod readSaleMethodChoice(int choice) {
        return switch (choice) {
            case 1 -> new SaleByUnit();
            case 2 -> new SaleByDozen();
            default -> null;
        };
    }
}
