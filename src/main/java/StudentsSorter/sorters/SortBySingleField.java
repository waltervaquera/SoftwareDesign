package StudentsSorter.sorters;

import StudentsSorter.Student;
import StudentsSorter.comparers.ICompareMethod;

import java.util.List;

public class SortBySingleField implements ISortMethod {
    ICompareMethod compareMethod;

    public SortBySingleField(ICompareMethod compareMethod) {
        this.compareMethod = compareMethod;
    }

    @Override
    public void sort(List<Student> students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compareMethod.compare(students.get(j), students.get(j+1)) > 0) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }
}
