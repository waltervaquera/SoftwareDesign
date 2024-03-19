package NumbersObservers;

import NumbersObservers.observers.MaxObserver;
import NumbersObservers.observers.MinObserver;
import NumbersObservers.observers.OddObserver;
import NumbersObservers.observers.SumObserver;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.attach(new SumObserver());
        numbers.attach(new MaxObserver());
        numbers.attach(new MinObserver());
        numbers.attach(new OddObserver(new SumObserver()));
        numbers.attach(new OddObserver(new MaxObserver()));
        numbers.attach(new OddObserver(new MinObserver()));

        addNumbers(numbers);
    }

    private static void addNumbers(Numbers numbers) {
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.remove(5);
    }
}
