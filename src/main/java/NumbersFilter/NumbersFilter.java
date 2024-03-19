package NumbersFilter;

import NumbersFilter.conditions.ICondition;

import java.util.List;

public class NumbersFilter {
    public void showAll(String message, List<Integer> numbers, ICondition condition) {
        System.out.println(message);
        for (int number : numbers) {
            if(condition.Evaluate(number)){
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
