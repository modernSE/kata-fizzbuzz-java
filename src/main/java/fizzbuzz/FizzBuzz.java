//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.Optional;

public class FizzBuzz {

	private final IInputOutput[] resolvers = new IInputOutput[] { new InputOutputFoo(), new InputOutputFizz(),
			new InputOutputBar(), new InputOutputBuzz() };

	public String translate(int number) {
		StringBuilder output = new StringBuilder();

		for (IInputOutput resolver : resolvers) {
			Optional<String> value = resolver.resolve(number);
			if (value.isPresent()) {
				output.append(value.get());
			}
		}

		return output.length() > 0 ? output.toString() : String.valueOf(number);
	}
}