//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.Optional;

public class FizzBuzz {

	private final IInputOutput[] resolvers = new IInputOutput[] { new InputOutputFizzBuzz(), new InputOutputBuzz(), new InputOutputFizz() };

	public String translate(int number) {
		for (IInputOutput resolver : resolvers) {
			Optional<String> value = resolver.resolve(number);
			if (value.isPresent()) {
				return value.get();
			}
		}

		return String.valueOf(number); // else just print it
	}
}