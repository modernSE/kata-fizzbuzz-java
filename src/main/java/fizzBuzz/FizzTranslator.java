package fizzBuzz;

public class FizzTranslator implements Translator {

	@Override
	public String translate(int number) {
		return number % 5 == 0 ? "Fizz" : "";
	}
}
