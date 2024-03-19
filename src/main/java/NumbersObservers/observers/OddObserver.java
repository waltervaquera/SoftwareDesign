package NumbersObservers.observers;

import java.util.ArrayList;
import java.util.List;

public class OddObserver implements IObserver {
    private final IObserver observer;

    public OddObserver(IObserver observer) {
        this.observer = observer;
    }

    @Override
    public void update(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 1) {
                oddNumbers.add(number);
            }
        }

        System.out.print("(Considering only odd numbers) ");
        observer.update(oddNumbers);
    }
}
