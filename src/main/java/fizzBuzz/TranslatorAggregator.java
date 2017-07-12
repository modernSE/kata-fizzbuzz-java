package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class TranslatorAggregator {
	private List<Translator> translators;
	
	TranslatorAggregator(List<Translator> translators){
		this.translators = translators;
	}
	

	public String translate(int number) {
		String output = "";
		for (Translator translator : translators) {
			output += translator.translate(number);
		}
		if ("".equals(output)) {
			output = String.valueOf(number);
		}
		return output;
	}
	
}
