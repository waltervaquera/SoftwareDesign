package NumbersFilter.conditions;

public class NegateCondition implements ICondition{
    ICondition condition;

    public NegateCondition(ICondition originalCondition) {
        condition = originalCondition;
    }
    @Override
    public boolean Evaluate(int x) {
        return !condition.Evaluate(x);
    }
}
