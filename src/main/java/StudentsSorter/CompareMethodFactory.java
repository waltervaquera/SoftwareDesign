package StudentsSorter;

import StudentsSorter.comparers.ComparerByAge;
import StudentsSorter.comparers.ComparerByGrade;
import StudentsSorter.comparers.ComparerByName;
import StudentsSorter.comparers.ICompareMethod;

import java.util.ArrayList;
import java.util.List;

public class CompareMethodFactory {
    private static CompareMethodFactory instance;

    private CompareMethodFactory() {}

    public static CompareMethodFactory getInstance() {
        if (instance == null) {
            instance = new CompareMethodFactory();
        }
        return instance;
    }

    public List<ICompareMethod> createCompareMethodsList(String[] sortingFields) {
        List<ICompareMethod> compareMethods = new ArrayList<>();
        for (String field : sortingFields) {
            compareMethods.add(createSimpleCompareMethod(field));
        }
        return compareMethods;
    }

    private static ICompareMethod createSimpleCompareMethod(String field) {
        switch (field.toLowerCase()) {
            case "name":
                return new ComparerByName();
            case "age":
                return  new ComparerByAge();
            case "grade":
                return new ComparerByGrade();
            default:
                System.out.println("Invalid sorting field: " + field);
                System.exit(1);
        }
        return null;
    }
}
