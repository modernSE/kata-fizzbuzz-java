package fizzBuzz;

public class BuzzTranslator implements Translator {

	@Override
	public String translate(int number) {
		String translation = "";
		if ((number % 7) == 0) {
			translation = "Buzz";
		}
		return translation;
	}

}
