//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public String translate(int number) {
		String result = "";
		List<Divider> checkers = registerChecker();
		for (Divider checker: checkers) {
			if (checker.isResponsible(number)) {
				result += checker.getName();
			}
		}
		if (result.equals("")) {
			result = String.valueOf(number);
		}
		return result;
	}


	private List<Divider> registerChecker() {
		List<Divider> registeredCheckers = new ArrayList<>();
		registeredCheckers.add(new Fizz());
		registeredCheckers.add(new Buzz());
		return registeredCheckers;
	}
}