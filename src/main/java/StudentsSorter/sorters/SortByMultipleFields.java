package StudentsSorter.sorters;

import StudentsSorter.Student;
import StudentsSorter.comparers.ICompareMethod;

import java.util.List;

public class SortByMultipleFields implements ISortMethod{
    List<ICompareMethod> compareMethods;

    public SortByMultipleFields(List<ICompareMethod> compareMethods) {
        this.compareMethods = compareMethods;
    }

    @Override
    public void sort(List<Student> students) {
        students.sort((s1, s2) -> {
            for (ICompareMethod compareMethod : compareMethods) {
                int result = compareMethod.compare(s1, s2);
                if (result != 0) {
                    return result;
                }
            }
            return 0;
        });
    }
}
