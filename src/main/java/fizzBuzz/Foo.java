package fizzBuzz;

public class Foo extends Translator implements INumberChecker{

	public Foo() {
		translation = "Foo";
	}
	
	@Override
	public boolean checkNumber(int number) {
		return ((number % 6) == 0) || (new Buzzer().checkNumber(number));
	}

}
