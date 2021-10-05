//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

/**
 * - violates OpenClosed priciple -> every new Buzzword needs a new else if branch
 * - Interface segregation: no Interface, necessary if there are also other translations needed in the future
 */

package fizzbuzz;

import java.util.Comparator;
import java.util.List;

public class FizzBuzz {

	private List<Rule> rules;

	public FizzBuzz(List<Rule> rules) {
		this.rules = rules;
		rules.sort(new Comparator<Rule>(){

			@Override
			public int compare(Rule o1, Rule o2) {
				if (o1.getOrder() == o2.getOrder()) {
					throw new IllegalArgumentException("same order is not allowed");
				}
				return o1.getOrder() < o2.getOrder() ? -1 : 1;
			}
			
		});
	}


	public String translate(int number) {
		StringBuilder builder = new StringBuilder();
		rules.stream().map(rule -> rule.evaluate(number)).filter(result -> result != null).forEach(res -> builder.append(res));
		return builder.length() > 0 ? builder.toString() : String.valueOf(number);

		/**
		 * 		if (((number % 5) == 0) && ((number % 7) == 0)) // A multiple of both?
			return "FizzBuzz";
		else if ((number % 5) == 0)
			return "Fizz"; // else a multiple of 5?
		else if ((number % 7) == 0)
			return "Buzz"; // else a multiple of 7?
		else
			return String.valueOf(number); // else just print it
		 */

	}
}

