//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {

	public String translate(int number) {
		Translator fizzTranslator = new FizzBuzzTranslator(5, "Fizz");
		Translator buzzTranslator = new FizzBuzzTranslator(7, "Buzz");
		Translator fooTranslator = new FooTranslator(List.of(6,7), "Foo");
		List<Translator> translators = List.of(fooTranslator, fizzTranslator, buzzTranslator);

		String translation = "";
		for(Translator translator: translators){
			translation += translator.translate(number);
		}

		if(translation.isBlank()){
			translation = String.valueOf(number);
		}
		return translation;
	}
}