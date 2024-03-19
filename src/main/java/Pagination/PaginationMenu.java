package Pagination;

import java.util.List;
import java.util.Scanner;

public class PaginationMenu {
    Scanner scanner = new Scanner(System.in);
    PaginationControls pagination;
    List<String> list;
    int pageSize;

    public PaginationMenu(List<String> list, int pageSize) {
        this.list = list;
        this.pageSize = pageSize;
    }

    public void printMenu() {
        pagination = new PaginationControls(list, pageSize);
        int choice;

        do {
            paginationMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            paginationAction(choice);
        } while (choice != 6);
    }

    private void paginationMenu() {
        System.out.println("---------------------");
        System.out.println("PAGINATION MENU");
        System.out.println("1: First Page");
        System.out.println("2: Last Page");
        System.out.println("3: Next Page");
        System.out.println("4: Previous Page");
        System.out.println("5: Go to page");
        System.out.println("6: Exit");
        System.out.println("---------------------");
    }

    private void paginationAction(int choice) {
        switch (choice) {
            case 1:
                pagination.first();
                break;
            case 2:
                pagination.last();
                break;
            case 3:
                pagination.next();
                break;
            case 4:
                pagination.prev();
                break;
            case 5:
                System.out.print("Enter the Page you want to go: ");
                pagination.goTo(scanner.nextInt());
                break;
            case 6:
                System.out.println("Exiting Pagination View...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
