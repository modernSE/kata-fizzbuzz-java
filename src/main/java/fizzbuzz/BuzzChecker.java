package fizzbuzz;

public class BuzzChecker implements Checker {

    @Override
    public String check(int number) {
        if ((number % 7) == 0)
			return "Buzz";
        return "";
    }
    
}
