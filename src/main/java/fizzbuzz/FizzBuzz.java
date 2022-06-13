//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {
	
	private Devider devider;

	public FizzBuzz(Devider devider) {
		this.devider = devider;
	}

	public String translate(int number) {
		if (isCompleteMatch(number)) // A multiple of both?
			return "FizzBuzz";
		else if (isSingleMatch(number, devider.getFirstDevider()))
			return "Fizz"; // else a multiple of 5?
		else if (isSingleMatch(number, devider.getSecondDevider()))
			return "Buzz"; // else a multiple of 7?
		else
			return String.valueOf(number); // else just print it
	}

	private boolean isCompleteMatch(int number) {
		return ((number % devider.getFirstDevider()) == 0) && ((number % devider.getSecondDevider()) == 0);
	}

	private boolean isSingleMatch(int number, int devider) {
		return number % devider == 0;
	}
}