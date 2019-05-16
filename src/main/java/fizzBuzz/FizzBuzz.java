//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Verletzte Prinzipien:
 * - Open-Closed: Beschränkung auf genau zwei fest Zahlen 5 + 7 und Erweiterungen bedingen neue else/ifs
 * 
 * @author modernSE
 *
 * -> Open / Closed ist gut gelöst
 * -> SR auch, aber Reihenfolge der Translators könnte noch gekapselt werden
 */
public class FizzBuzz {
	
	private List<Translator> translators = new ArrayList<>();
	
	public FizzBuzz(List<Translator> translators) {
		this.translators.addAll(translators);
	}
	
	public String translate(int number) {
		StringBuilder stringBuilder = new StringBuilder();
		for (final Translator translator : translators) {
			stringBuilder.append(translator.translate(number));
		}
		
		String result = stringBuilder.toString();
		if (result.isEmpty()) {
			return String.valueOf(number);
		}
		return result;
	}
}