package fizzbuzz;

public class BarCondition implements Condition {
    
    public String translate(int number) {
        if (containsThree(number)) {
			return "Bar";
		}
		return "";
    }

    private boolean containsThree(int number) {
        String n = Integer.toString(number);
        return n.contains("3");
    }
}
