package fizzbuzz;

public class FizzChecker implements Checker {

    @Override
    public String check(int number) {
        if ((number % 5) == 0)
			return "Fizz";
        return "";
    }
    
}
