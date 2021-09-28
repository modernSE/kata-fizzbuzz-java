package fizzbuzz;

public class BuzzRule implements Rule{

    @Override
    public String evaluate(int number) {
        return (number % 7) == 0 ? "Buzz" : null;
    }

    @Override
    public int getOrder() {
        return 4;
    }
    
}
