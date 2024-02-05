package fizzbuzz;

public class BuzzCondition implements Condition {
    
    public String translate(int number) {
        if (number % 7 == 0) {
			return "Buzz";
		}
		return "";
    }
}
