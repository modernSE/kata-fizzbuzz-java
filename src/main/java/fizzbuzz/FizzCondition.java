package fizzbuzz;

public class FizzCondition implements Condition {
    
    public String translate(int number) {
        if (number % 5 == 0) {
			return "Fizz";
		}
		return "";
    }
}
