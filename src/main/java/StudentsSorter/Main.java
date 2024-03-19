package StudentsSorter;

import StudentsSorter.comparers.ICompareMethod;
import StudentsSorter.sorters.SortByMultipleFields;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentsList students = loadStudentsList();
        students.showAll();

        String[] sortingFields = readSortingFields();
        List<ICompareMethod> compareMethods = CompareMethodFactory.getInstance().createCompareMethodsList(sortingFields);

        students.setSortMethod(new SortByMultipleFields(compareMethods));
        students.sort();

        students.showAll();
    }

    private static StudentsList loadStudentsList() {
        StudentsList students = new StudentsList();

        students.add(new Student("John", 20, 50));
        students.add(new Student("Steven", 22, 60));
        students.add(new Student("Steven", 22, 50));
        students.add(new Student("John", 23, 70));
        students.add(new Student("Steven", 21, 70));
        return students;
    }

    private static String[] readSortingFields() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce sorting fields separated by spaces (name, age, grade): ");
        String input = scanner.nextLine();

        return input.split("\\s+");
    }
}
