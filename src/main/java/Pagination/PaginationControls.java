package Pagination;

import java.util.List;

public class PaginationControls {
    private final List<String> list;
    private final int pageSize;
    private int currentPageIndex;

    public PaginationControls(List<String> list, int pageSize) {
        this.list = list;
        this.pageSize = pageSize;
        this.currentPageIndex = 0;
    }

    public void first() {
        currentPageIndex = 0;
        displayCurrentPage();
    }

    public void last() {
        currentPageIndex = (list.size() - 1) / pageSize;
        displayCurrentPage();
    }

    public void next() {
        if (currentPageIndex < (list.size() - 1) / pageSize) {
            currentPageIndex++;
            displayCurrentPage();
        } else {
            System.out.println("Already on the last page.");
        }
    }

    public void prev() {
        if (currentPageIndex > 0) {
            currentPageIndex--;
            displayCurrentPage();
        } else {
            System.out.println("Already on the first page.");
        }
    }

    public void goTo(int pageNumber) {
        int lastIndex = (list.size() - 1) / pageSize;
        if (pageNumber >= 1 && pageNumber <= lastIndex + 1) {
            currentPageIndex = pageNumber - 1;
            displayCurrentPage();
        } else {
            System.out.println("Invalid page number.");
        }
    }

    private void displayCurrentPage() {
        int startIndex = currentPageIndex * pageSize;
        int endIndex = Math.min(startIndex + pageSize, list.size());
        List<String> currentPage = list.subList(startIndex, endIndex);
        System.out.println("Page " + (currentPageIndex + 1) + ": " + currentPage);
    }
}
