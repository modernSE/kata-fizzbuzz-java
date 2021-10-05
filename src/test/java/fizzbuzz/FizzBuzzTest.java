package fizzbuzz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

private FizzBuzz fizzer;

	@Before
	public void setUp() {
		fizzer = new FizzBuzz(List.of(new FizzRule(), new BuzzRule()));
	}

	@Test
	public void Fizz() {
		String result = fizzer.translate(15);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void Buzz() {
		String result = fizzer.translate(14);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void FizzBuzz() {
		String result = fizzer.translate(35);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		String result = fizzer.translate(4);
		assertEquals("4", result);
	}
}
