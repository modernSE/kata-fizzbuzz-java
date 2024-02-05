package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void Fizz() {
		FizzBuzzTranslator translator = new FizzBuzzTranslator();
		String result = translator.translate(15);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void FooBuzz() {
		FizzBuzzTranslator translator = new FizzBuzzTranslator();
		String result = translator.translate(14);
		assertEquals("FooBuzz", result);
	}
	
	@Test
	public void FooFizzBuzz() {
		FizzBuzzTranslator translator = new FizzBuzzTranslator();
		String result = translator.translate(70);
		assertEquals("FooFizzBuzz", result);
	}

	@Test
	public void FooFizzBarBuzz() {
		FizzBuzzTranslator translator = new FizzBuzzTranslator();
		String result = translator.translate(35);
		assertEquals("FooFizzBarBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		FizzBuzzTranslator translator = new FizzBuzzTranslator();
		String result = translator.translate(4);
		assertEquals("4", result);
	}
}
