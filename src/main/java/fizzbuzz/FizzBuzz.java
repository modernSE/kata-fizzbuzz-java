//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	List<NumberHandler> handlers = new ArrayList<>();
	

	public String translate(int number) {
		

		if (isDivisibleBy(number, 5) && isDivisibleBy(number, 7)) // A multiple of both?
			return "FizzBuzz";
		else if (isDivisibleBy(number, 5))
			return "Fizz"; // else a multiple of 5?
		else if (isDivisibleBy(number, 7))
			return "Buzz"; // else a multiple of 7?
		else
			return String.valueOf(number); // else just print it
	}

	private boolean isDivisibleBy(int number, int divisor) {
		return (number % divisor) == 0;
	}

}