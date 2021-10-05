package fizzbuzz;

public class FizzRule implements Rule {

    @Override
    public String evaluate(int number) {
        return (number % 5) == 0 ? "Fizz" : null;
    }

    @Override
    public int getOrder() {
        return 2;
    }

}