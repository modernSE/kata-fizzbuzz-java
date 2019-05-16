package fizzBuzz;

public class Main {

	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.addChecker(new Foo());
		fizzBuzz.addChecker(new Fizzer());
		fizzBuzz.addChecker(new Bar());
		fizzBuzz.addChecker(new Buzzer());
		
		for(int number = 0; number < 1000; number++)
		System.out.println(fizzBuzz.translate(number));
	}

}
