package NumbersFilter.conditions;

public class AlwaysTrueCondition implements ICondition{
    @Override
    public boolean Evaluate(int x) {
        return true;
    }
}
