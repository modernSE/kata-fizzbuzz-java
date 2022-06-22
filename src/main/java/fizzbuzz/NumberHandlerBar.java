package fizzbuzz;

public class NumberHandlerBar implements NumberHandler {
    
    private static final int DIVISOR_ONE = 7;
    private static final int DIVISOR_TWO = 6;


    @Override
    public boolean isRelevant(int number) {
        return (number % DIVISOR_ONE) == 0 || (number % DIVISOR_TWO) == 0 ;
    }

}
