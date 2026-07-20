//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;

public class FizzBuzz {

	List<ConditionWord> conditions;

	public FizzBuzz() {
		this.conditions = List.of(
			new ConditionWord(new OrCondition(List.of(
				new ModuloCondition(6),
				new ModuloCondition(7)
			)), "Foo"),
			new ConditionWord(new ModuloCondition(5), "Fizz"),
			new ConditionWord(new ContainsCondition(3), "Bar"),
			new ConditionWord(new ModuloCondition(7), "Buzz")			
		);
	}

	public String translate(int number) {
		String result = "";
		for (ConditionWord conditionWord : conditions) {
			result += conditionWord.evaluate(number);
		}

		if (result.isEmpty()) {
			return String.valueOf(number);
		}
		return result;
	}
}