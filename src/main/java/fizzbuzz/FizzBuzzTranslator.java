//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;

public class FizzBuzzTranslator {

	private List<FizzBuzzMappingEnum> translations;

	public FizzBuzzTranslator(){
		translations = List.of(FizzBuzzMappingEnum.values());
	}

	public String translate(int number) {
		String value = this.appendFizzBuzzWords(number);
		if(value.length() == 0){
			value = String.valueOf(number);
		}
		return value; 		
	}

	private String appendFizzBuzzWords(int number){
		String value = "";
		for(FizzBuzzMappingEnum translation: translations){
			if(translation.validator.isValid(number, translation.numbers)){
				value = value + translation.translation;
			}
		}
		return value;
	}

}