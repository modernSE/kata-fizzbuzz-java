package fizzbuzz;

public class FuzzCondition implements Condition {
    
    public String translate(int number) {
        if (number % 11 == 0) {
			return "Fuzz";
		}
		return "";
    }
}
