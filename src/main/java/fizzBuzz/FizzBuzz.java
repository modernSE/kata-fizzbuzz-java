//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private TranslatorAggregator translatorAggregator;


	FizzBuzz() {
		List<Translator> translators = new ArrayList<Translator>();
		translators.add(new FooTranslator());
		translators.add(new FizzTranslator());
		translators.add(new BarTranslator());
		translators.add(new BuzzTranslator());
		translatorAggregator = new TranslatorAggregator(translators);

	}

	public String translate(int number) {
		return translatorAggregator.translate(number);
	}

	/*
	 * comments:
	 * 
	 * - checks verletzen single responsibility/ sind eigene Logik - open closed:
	 * if-else Konstrukt macht es schwer weitere Fälle zu ergänzen - clean code wäre
	 * auch nicht schlecht - mit dem neuen Checker (enthält 3) kommt eine andere
	 * Logik hinzu -> check-Logiken separieren - dependency inversion: checks
	 * injecten - checks: gemeinsames interface, verschiedene Klassen - KERNFRAGE
	 * die bleibt: wer kümmert sich um die Logik der Reihenfolge der checks
	 */
}