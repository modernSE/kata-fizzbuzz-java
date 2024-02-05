//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.ServiceLoader;

public class FizzBuzz {

	public String translate(int number) {
		var output = new StringBuilder();
		ServiceLoader<Rule> providers = ServiceLoader.load(Rule.class);
		for(var provider : providers){
			output.append(provider.check(String.valueOf(number)));
		}
		return output.length() == 0 ? String.valueOf(number) : output.toString();
	}

	private enum Rules{
		Foo,
		Fizz,
		Bar,
		Buzz
	}
}