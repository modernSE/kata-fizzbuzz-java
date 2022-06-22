package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	FizzChecker fizzChecker = new FizzChecker();
	BuzzChecker buzzChecker = new BuzzChecker();

	@Test
	public void Fizz() {
		FizzBuzz fizzer = new FizzBuzz(fizzChecker, buzzChecker);
		String result = fizzer.translate(15);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void Buzz() {
		FizzBuzz buzzer = new FizzBuzz(fizzChecker, buzzChecker);
		String result = buzzer.translate(14);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void FizzBuzz() {
		FizzBuzz fizzbuzzer = new FizzBuzz(fizzChecker, buzzChecker);
		String result = fizzbuzzer.translate(35);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		FizzBuzz rand = new FizzBuzz(fizzChecker, buzzChecker);
		String result = rand.translate(4);
		assertEquals("4", result);
	}
}
