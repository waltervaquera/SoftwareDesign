package NumbersFilter.conditions;

public class PrimeCondition implements ICondition{

    @Override
    public boolean Evaluate(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) return false;
        }

        return true;
    }
}
