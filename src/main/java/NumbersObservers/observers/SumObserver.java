package NumbersObservers.observers;

import java.util.List;

public class SumObserver implements IObserver {
    public void update(List<Integer> numbers) {
        int summation = 0;
        for (int number : numbers) {
            summation += number;
        }

        System.out.println("The sum of numbers is: " + summation);
    }
}
