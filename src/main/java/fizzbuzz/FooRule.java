package fizzbuzz;

public class FooRule implements FizzBuzzRule {

    @Override
    public String getStringValue(int number) {
        if ((number % 6) == 0 || (number%7) == 0) {
            return "Foo";
        }
        return "";
    }
    
}