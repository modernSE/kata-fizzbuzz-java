package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void Fizz() {
		WordHandler fizzer = new WordHandler();
		String result = fizzer.translate(15);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void Buzz() {
		WordHandler buzzer = new WordHandler();
		String result = buzzer.translate(14);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void FizzBuzz() {
		WordHandler fizzbuzzer = new WordHandler();
		String result = fizzbuzzer.translate(35);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		WordHandler handler = new WordHandler();
		String result = handler.translate(4);
		assertEquals("4", result);
	}
}
