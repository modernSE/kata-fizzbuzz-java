package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void Fizz() {
		FizzBuzz fizzer = new FizzBuzz();
		String result = fizzer.translate(15);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void Buzz() {
		FizzBuzz buzzer = new FizzBuzz();
		String result = buzzer.translate(14);
		assertEquals("FooBuzz", result);
	}
	
	@Test
	public void FizzBuzz() {
		FizzBuzz fizzbuzzer = new FizzBuzz();
		String result = fizzbuzzer.translate(35);
		assertEquals("FizzFooBarBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		FizzBuzz rand = new FizzBuzz();
		String result = rand.translate(4);
		assertEquals("4", result);
	}
}
