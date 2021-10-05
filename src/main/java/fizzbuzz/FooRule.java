package fizzbuzz;

public class FooRule implements Rule {

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public String evaluate(int number) {
        return (number % 6) == 0 || (number % 7) == 0 ? "Foo" : null;
    }
    
}
