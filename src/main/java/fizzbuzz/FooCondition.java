package fizzbuzz;

public class FooCondition implements Condition {
    
    public String translate(int number) {
        if (number % 7 == 0 || number % 6 == 0) {
			return "Foo";
		}
		return "";
    }
}
