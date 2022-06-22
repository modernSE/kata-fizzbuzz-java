//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;

public class FizzBuzz {

	List<HitCondition> conditions = List.of(
		new FooHitCondition(),
		new FizzBuzzHitCondition(),
		new FizzHitCondition(),
		new BarHitCondition(),
		new BuzzHitCondition()
	);

	public String translate(int number) {
		for (HitCondition condition : conditions) {
			if (condition.isHit(number)) {
				return condition.getHitWord();
			}
		}

		return String.valueOf(number);
	}
}