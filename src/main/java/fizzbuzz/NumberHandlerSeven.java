package fizzbuzz;

public class NumberHandlerSeven implements NumberHandler {

    private static final int DIVISOR = 7;

    @Override
    public boolean isRelevant(int number) {
        return (number % DIVISOR) == 0;
    }
    
}