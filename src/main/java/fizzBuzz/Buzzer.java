package fizzBuzz;

public class Buzzer extends Translator implements INumberChecker{

	public Buzzer() {
		translation = "Buzz";
	}
	@Override
	public boolean checkNumber(int number) {
		return (number % 7) == 0;
	}
}
