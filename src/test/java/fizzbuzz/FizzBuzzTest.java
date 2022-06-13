package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void Fizz() {
		Devider devider = new Devider(5, 7);
		FizzBuzz fizzer = new FizzBuzz(devider);
		String result = fizzer.translate(15);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void Buzz() {
		Devider devider = new Devider(5, 7);
		FizzBuzz buzzer = new FizzBuzz(devider);
		String result = buzzer.translate(14);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void FizzBuzz() {
		Devider devider = new Devider(5, 7);
		FizzBuzz fizzbuzzer = new FizzBuzz(devider);
		String result = fizzbuzzer.translate(35);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		Devider devider = new Devider(5, 7);
		FizzBuzz rand = new FizzBuzz(devider);
		String result = rand.translate(4);
		assertEquals("4", result);
	}
}
