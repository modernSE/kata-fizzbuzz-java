//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import fizzbuzz.Translater.TranslaterStrategy;

public class FizzBuzz {

	public String translate(int number) {
		TranslaterStrategy s = new TranslaterStrategy();
		return s.translate(number);
	}
}