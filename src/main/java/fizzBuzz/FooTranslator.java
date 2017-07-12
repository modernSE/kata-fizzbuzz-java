package fizzBuzz;

public class FooTranslator implements Translator{

	@Override
	public String translate(int number) {
		String translation = "";
		if ((number % 6) == 0 || (number % 7) == 0) {
			translation = "Foo";
		}
		return translation;
	}
	

}
