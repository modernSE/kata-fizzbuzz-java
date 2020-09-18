package fizzbuzz;

public class FizzRule implements FizzBuzzRule {

    @Override
    public String getStringValue(int number) {
        if ((number % 5) == 0) {
            return "Fizz";
        }
        return "";
    }
}