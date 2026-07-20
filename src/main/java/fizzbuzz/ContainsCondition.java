package fizzbuzz;

public class ContainsCondition implements Condition {

    private final int number;

    public ContainsCondition(int number) {
        this.number = number;
    }

    @Override
    public boolean evaluate(int input) {
        return String.valueOf(input).contains(String.valueOf(number));
    }

}
