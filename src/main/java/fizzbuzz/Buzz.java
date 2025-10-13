package fizzbuzz;

public class Buzz implements Divider{
    final String NAME = "Buzz";
    final int DIVIDER = 7;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public boolean isResponsible(int number) {
        return (number % DIVIDER) == 0;
    }
}
