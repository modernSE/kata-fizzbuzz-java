package fizzbuzz;

public class DefaultRule implements FizzBuzzRule {

    @Override
    public String getStringValue(int number) {
        return String.valueOf(number);
    }
    
}