//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzBuzz;

import java.util.List;

/*
 * Verletzte Prinzipien:
 * - Single Responsibility: Zuordnung Bedingung -> Wert, Legt Ordnung/Reihenfolge fest
 * - Open Closed (z.B. Erweiterung: Teilbar durch 3?)
 * - Dependency Inversion: nicht umgesetzt/umsetzbar wegen S und O
 */
public class NumberTranslator {

	private List<ConditionTranslation> translations;
	
	public NumberTranslator(List<ConditionTranslation> translations) {
		this.translations = translations;
	}

	public String translate(int number) {
		StringBuilder stringBuilder = new StringBuilder();
		for (ConditionTranslation translation : translations) {		
			if (translation.matches(number))
				stringBuilder.append(translation.getTranslation());
		}
		String string = stringBuilder.toString();
		return toDefaultIfEmpty(number, string);
	}

	private String toDefaultIfEmpty(int number, String string) {
		if (string.isEmpty()) {
			return String.valueOf(number);
		}
		return string;
	}
}