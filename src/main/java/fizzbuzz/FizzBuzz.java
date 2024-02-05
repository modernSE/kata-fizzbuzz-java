//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;

public class FizzBuzz {

	private List<Condition> conditions;

	public FizzBuzz(List<Condition> conditions) {
		this.conditions = conditions;
	}

	public String translate(int number) {
		String translated = "";
		for (Condition condition : conditions) {
			translated += condition.translate(number);
		}
		if (translated.isBlank()) {
			translated = String.valueOf(number);
		}
		return translated;
	}
}