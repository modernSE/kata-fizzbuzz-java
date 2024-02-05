package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void Fizz() {
		ExtendedFizzBuzzTranslator fizzer = new ExtendedFizzBuzzTranslator(new ArrayList<> (Arrays.asList("Fizz", "Buzz")),new ArrayList<> (Arrays.asList(5, 7)));
		Translator translator = new Translator(fizzer);
		String result = translator.translate(15);
		assertEquals("Fizz", result);
	}

	@Test
	public void FizzExtended() {
		ExtendedFizzBuzzTranslator fizzer = new ExtendedFizzBuzzTranslator(new ArrayList<> (Arrays.asList("Fizz", "Buzz")),new ArrayList<> (Arrays.asList(5, 7)));
		Translator translator = new Translator(fizzer);
		String result = translator.translate(35);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void Buzz() {
		ExtendedFizzBuzzTranslator fizzer = new ExtendedFizzBuzzTranslator(new ArrayList<> (Arrays.asList("Fizz", "Buzz")),new ArrayList<> (Arrays.asList(5, 7)));
		Translator translator = new Translator(fizzer);
		String result = translator.translate(14);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void FizzBuzz() {
		ExtendedFizzBuzzTranslator fizzer = new ExtendedFizzBuzzTranslator(new ArrayList<> (Arrays.asList("Fizz", "Buzz")),new ArrayList<> (Arrays.asList(5, 7)));
		Translator translator = new Translator(fizzer);
		String result = translator.translate(35);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		ExtendedFizzBuzzTranslator fizzer = new ExtendedFizzBuzzTranslator(new ArrayList<> (Arrays.asList("Fizz", "Buzz")),new ArrayList<> (Arrays.asList(5, 7)));
		Translator translator = new Translator(fizzer);
		String result = translator.translate(4);
		assertEquals("4", result);
	}
}
