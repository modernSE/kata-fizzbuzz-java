package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private NumberTranslator fizzBuzzTranslator;
	
	public FizzBuzz() {
		List<ConditionTranslation> translations = new ArrayList<ConditionTranslation>();
		translations.add(new ConditionTranslation(i -> i % 6 == 0 || i % 7 == 0, "Foo"));
		translations.add(new ConditionTranslation(i -> i % 5 == 0, "Fizz"));
		translations.add(new ConditionTranslation(this::contains3, "Bar"));
		translations.add(new ConditionTranslation(i -> i % 7 == 0, "Buzz"));
		
		this.fizzBuzzTranslator = new NumberTranslator(translations);
	}
	
	private boolean contains3(int i) {
		return String.valueOf(i).contains("3");
	}
	
	public String translate(int number) {
		return fizzBuzzTranslator.translate(number);
	}
}
