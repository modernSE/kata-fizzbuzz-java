//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class Bar implements ITranslator {

	public String translate(int number) {
		String numberToString = String.valueOf(number);
		if (numberToString.indexOf("3") > -1)
			return "Bar"; // else a multiple of 5?
		else
			return ""; // else just print it
	}
}