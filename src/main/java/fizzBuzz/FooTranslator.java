package fizzBuzz;

public class FooTranslator implements Translator {

	@Override
	public String translate(int number) {
		return number % 6 == 0 || number % 7 == 0 ? "Foo" : "";
	}
}
