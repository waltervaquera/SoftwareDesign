package StudentsSorter.comparers;

import StudentsSorter.Student;

public class ComparerByName implements ICompareMethod {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
