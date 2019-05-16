package fizzBuzz;

public class Fizzer extends Translator implements INumberChecker{

	public Fizzer() {
		translation = "Fizz";
	}
	@Override
	public boolean checkNumber(int number) {
		return ((number % 5) == 0);
	}	
}
