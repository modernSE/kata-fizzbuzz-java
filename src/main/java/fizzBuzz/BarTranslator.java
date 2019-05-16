package fizzBuzz;

public class BarTranslator implements Translator {

	@Override
	public String translate(int number) {
		return String.valueOf(number).contains("3") ? "Bar" : "";	         
	}
}
