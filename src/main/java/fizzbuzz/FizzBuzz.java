//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class FizzBuzz {

	private final Set<Translator> translators = new HashSet<>();

	public String translate(int number) {

		for(Translator translator : translators){
			if(translator.shouldTranslate(number)){
				return translator.translate();
			}
		}
		return String.valueOf(number);
	}

	public void init() {
		List<Checker> checkers = List.of(new SimpleModuloChecker(5), new SimpleModuloChecker(7));
		translators.add(new Translator("FizzBuzz", checkers));
		Checker checker = new SimpleModuloChecker(5);
		translators.add(new Translator("Fizz", List.of(checker)));
		checker = new SimpleModuloChecker(7);
		translators.add(new Translator("Buzz",List.of(checker)));
	}
}