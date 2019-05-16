package fizzBuzz;

public class BuzzTranslator implements Translator {

	@Override
	public String translate(int number) {
		return number % 7 == 0 ? "Buzz" : "";
	}
}
