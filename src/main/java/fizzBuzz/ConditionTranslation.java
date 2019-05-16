package fizzBuzz;

import java.util.function.Predicate;

public class ConditionTranslation {

	private final Predicate<Integer> predicate;
	private final String translation;
	
	public ConditionTranslation(Predicate<Integer> predicate, String translation) {
		this.predicate = predicate;
		this.translation = translation;
	}
	
	public boolean matches(int number) {
		return predicate.test(number);
	}

	public String getTranslation() {
		return translation;
	}
	
	
}
