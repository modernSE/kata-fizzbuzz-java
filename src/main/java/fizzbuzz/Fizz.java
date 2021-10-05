//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class Fizz implements ITranslator {

	public String translate(int number) {
		if ((number % 5) == 0)
			return "Fizz"; // else a multiple of 5?
		else
			return ""; // else just print it
	}
}