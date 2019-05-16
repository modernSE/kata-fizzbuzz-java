package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Translator> translators = new ArrayList();
		
		// Festlegung der Reiehenfolge ist die Verantwortung von FizzBuzz
		translators.add(new FooTranslator());
		translators.add(new FizzTranslator());
		translators.add(new BarTranslator());
		translators.add(new BuzzTranslator());
		
		FizzBuzz fizzBuzz = new FizzBuzz(translators);
		System.out.println(fizzBuzz.translate(35));
		System.out.println(fizzBuzz.translate(30));
		System.out.println(fizzBuzz.translate(99));
	}
}
