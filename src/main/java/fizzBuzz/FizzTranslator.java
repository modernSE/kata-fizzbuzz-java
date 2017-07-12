package fizzBuzz;

public class FizzTranslator implements Translator {

	@Override
	public String translate(int number) {
		String translation = "";
		if ((number % 5) == 0) {
			translation = "Fizz";
		}
		return translation;
	}

}
