//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;

public class FizzBuzz {

    private List<FizzBuzzRule> rules = List.of(new FooRule(), //
            new FizzRule(), //
            new BuzzRule());

    private FizzBuzzRule defaultRule = new DefaultRule();    

	public String translate(int number) {
        StringBuilder builder = new StringBuilder();
        for (FizzBuzzRule rule : rules) {
            builder.append(rule.getStringValue(number));
        }
        if (builder.length() == 0) {
            builder.append(defaultRule.getStringValue(number));
        }
        return builder.toString();
	}
}