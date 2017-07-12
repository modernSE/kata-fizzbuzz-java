package fizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void Fizz() {
		FizzBuzz fizzer = new FizzBuzz();
		String result = fizzer.translate(15);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void Bar() {
		FizzBuzz fizzer = new FizzBuzz();
		String result = fizzer.translate(3);
		assertEquals("Bar", result);
	}
	
	@Test
	public void FooFizzBarBuzz() {
		FizzBuzz fizzbuzzer = new FizzBuzz();
		String result = fizzbuzzer.translate(35);
		assertEquals("FooFizzBarBuzz", result);
	}
	
	@Test
	public void Foo() {
		FizzBuzz fizzbuzzer = new FizzBuzz();
		String result = fizzbuzzer.translate(6);
		assertEquals("Foo", result);
	}
	
	@Test
	public void FooBuzz() {
		FizzBuzz fizzbuzzer = new FizzBuzz();
		String result = fizzbuzzer.translate(7);
		assertEquals("FooBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		FizzBuzz rand = new FizzBuzz();
		String result = rand.translate(4);
		assertEquals("4", result);
	}
}
