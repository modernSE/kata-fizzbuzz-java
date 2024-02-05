//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzzTranslator implements ITranslator{

	private int fizz;
	private int buzz;

	public FizzBuzzTranslator(int fizz, int buzz) {
		this.fizz = fizz;
		this.buzz = buzz;
	}

	public String applyRules(int number) {
		if (isFizz(number) && isBuzz(number)) // A multiple of both?
			return "FizzBuzz";
		else if (isFizz(number))
			return "Fizz"; // else a multiple of 5?
		else if (isBuzz(number))
			return "Buzz"; // else a multiple of 7?
		else
			return String.valueOf(number); // else just print it
	}

	private boolean isFizz(int number){
		return (number % fizz) == 0;
	}

	private boolean isBuzz(int number){
		return (number % buzz) == 0;
	}
}