package StudentsSorter;

import StudentsSorter.sorters.ISortMethod;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {
    private final List<Student> students = new ArrayList<>();
    private ISortMethod sortMethod;

    public void setSortMethod(ISortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    public void add(Student student) {
        students.add(student);
    }

    public void showAll() {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public void sort() {
        sortMethod.sort(students);
    }
}
