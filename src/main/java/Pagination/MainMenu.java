package Pagination;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
    static List<String> list = new ArrayList<>();
    static int pageSize = 5;
    static PaginationMenu paginationMenu;

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            action(choice);
        } while (choice != 4);
    }

    private static void printMenu() {
        System.out.println("---------------------");
        System.out.println("GENERAL MENU");
        System.out.println("1: Add Elements to the List");
        System.out.println("2: Set Page Size (default 5)");
        System.out.println("3: Access Paginated View");
        System.out.println("4: Exit");
        System.out.println("---------------------");
    }

    private static void action(int choice) {
        switch (choice) {
            case 1:
                addElement();
                break;
            case 2:
                setPageSize();
                break;
            case 3:
                paginationMenu = new PaginationMenu(list, pageSize);
                paginationMenu.printMenu();
                break;
            case 4:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }

    private static void addElement() {
        System.out.print("Enter the Element to Add: ");
        list.add(scanner.next());
    }

    private static void setPageSize() {
        System.out.print("Enter the Page Size: ");
        pageSize = scanner.nextInt();
    }
}
