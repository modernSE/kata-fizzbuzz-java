package fizzbuzz;

public class BuzzRule implements FizzBuzzRule {

    @Override
    public String getStringValue(int number) {
        if ((number % 7) == 0) {
            return "Buzz";
        }
        return "";
    }
}