package fizzbuzz;

public class Fizz implements Divider {
    final String NAME = "Fizz";
    final int DIVIDER = 5; 

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public boolean isResponsible(int number) {
        return (number % DIVIDER) == 0;
    }
}
