package NumbersObservers.observers;

import java.util.List;

public class MaxObserver implements IObserver {
    public void update(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("There is no maximum number.");
            return;
        }

        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The maximum number is: " + max);
    }
}
