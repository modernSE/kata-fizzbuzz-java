//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class Buzz implements ITranslator {

	public String translate(int number) {
		if ((number % 7) == 0)
			return "Buzz"; // else a multiple of 7?
		else
			return ""; // else just print it
	}
}