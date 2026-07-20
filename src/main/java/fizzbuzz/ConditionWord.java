package fizzbuzz;

public class ConditionWord {
    
    private final Condition condition;

    private final String word;

    public ConditionWord(Condition condition, String word) {
        this.condition = condition;
        this.word = word;
    }

    public String evaluate(int input) {
        if (condition.evaluate(input)){
            return word;
        }

        return "";
    }
}
