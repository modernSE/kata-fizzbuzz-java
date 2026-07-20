package fizzbuzz;

import java.util.List;

public class OrCondition implements Condition {

    private final List<Condition> conditions;

    public OrCondition(List<Condition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean evaluate(int input) {
        return conditions.stream().anyMatch(conditon -> conditon.evaluate(input));
    }
    
}
