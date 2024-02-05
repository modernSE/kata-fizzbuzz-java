package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void Fizz() {
		FizzBuzz fizzer = givenFizzBuzz();
		String result = fizzer.translate(15);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void Buzz() {
		FizzBuzz buzzer = givenFizzBuzz();
		String result = buzzer.translate(14);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void FizzBuzz() {
		FizzBuzz fizzbuzzer = givenFizzBuzz();
		String result = fizzbuzzer.translate(35);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		FizzBuzz rand = givenFizzBuzz();
		String result = rand.translate(4);
		assertEquals("4", result);
	}

	@Test
	public void Fuzz() {
		FizzBuzz bizzbuzzer = new FizzBuzz(List.of(new FizzCondition(), new BuzzCondition(), new FuzzCondition()));
		String result = bizzbuzzer.translate(121);
		assertEquals("Fuzz", result);
	}

	@Test
	public void Foo() {
		FizzBuzz bizzbuzzer = new FizzBuzz(List.of(new FooCondition(), new FizzCondition(), new BuzzCondition()));
		String result = bizzbuzzer.translate(6);
		assertEquals("Foo", result);
	}

	@Test
	public void FooBuzz() {
		FizzBuzz bizzbuzzer = new FizzBuzz(List.of(new FooCondition(), new FizzCondition(), new BuzzCondition()));
		String result = bizzbuzzer.translate(42);
		assertEquals("FooBuzz", result);
	}

	@Test
	public void Everthing() {
		FizzBuzz bizzbuzzer = new FizzBuzz(List.of(new FooCondition(), new FizzCondition(), new BarCondition(), new BuzzCondition()));
		String result = bizzbuzzer.translate(35);
		assertEquals("FooFizzBarBuzz", result);
	}

	private FizzBuzz givenFizzBuzz() {
		return new FizzBuzz(List.of(new FizzCondition(), new BuzzCondition()));
	}
}
