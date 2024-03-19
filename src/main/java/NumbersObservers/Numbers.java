package NumbersObservers;

import NumbersObservers.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    List<Integer> numbers;
    List<IObserver> observers;

    public Numbers() {
        numbers = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void attach(IObserver observer) {
        observers.add(observer);
    }

    public void add(int n) {
        if (!numbers.contains(n)) {
            numbers.add(n);
            notifyObservers();
        }
    }

    public void remove(int n) {
        if (numbers.contains(n)) {
            numbers.remove((Integer) n);
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(numbers);
        }
    }
}
