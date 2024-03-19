package NumbersFilter;

import NumbersFilter.conditions.AlwaysTrueCondition;
import NumbersFilter.conditions.MultipleCondition;
import NumbersFilter.conditions.NegateCondition;
import NumbersFilter.conditions.PrimeCondition;

import java.util.ArrayList;
import java.util.Random;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> randomNumbers = generateRandomNumbers();
        NumbersFilter numbersFilter = new NumbersFilter();

        numbersFilter.showAll("All Numbers", randomNumbers, new AlwaysTrueCondition());
        numbersFilter.showAll("Even Numbers", randomNumbers, new MultipleCondition(2));
        numbersFilter.showAll("Odd Numbers", randomNumbers, new NegateCondition(new MultipleCondition(2)));
        numbersFilter.showAll("Multiples of 5", randomNumbers, new MultipleCondition(5));
        numbersFilter.showAll("Not Multiples of 5", randomNumbers, new NegateCondition(new MultipleCondition(5)));
        numbersFilter.showAll("Prime Numbers", randomNumbers, new PrimeCondition());
    }
    
    public static List<Integer> generateRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        return randomNumbers;
    }
}
