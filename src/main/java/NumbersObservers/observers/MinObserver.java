package NumbersObservers.observers;

import java.util.List;

public class MinObserver implements IObserver {
    public void update(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("There is no minimum number.");
            return;
        }

        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("The minimum number is: " + min);
    }
}
