package NumbersFilter.conditions;

public class MultipleCondition implements ICondition {
    private final int number;

    public MultipleCondition(int number) {
        this.number = number;
    }

    @Override
    public boolean Evaluate(int x) {
        return x % number == 0;
    }
}
