package fizzbuzz;

public class NumberHandlerFive implements NumberHandler {

    @Override
    public boolean isRelevant(int number) {
        return (number % 5) == 0;
    }
    
}