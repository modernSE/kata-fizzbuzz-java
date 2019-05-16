package fizzBuzz;

public class Bar extends Translator implements INumberChecker{

	public Bar() {
		translation = "Bar";
	}
	@Override
	public boolean checkNumber(int number) {
		return Integer.toString(number).contains("3");
	}

}
