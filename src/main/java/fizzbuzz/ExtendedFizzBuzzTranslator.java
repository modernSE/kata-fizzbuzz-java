//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.ArrayList;

public class ExtendedFizzBuzzTranslator implements ITranslator{

	private ArrayList<String> words;
	private ArrayList<Integer> numbers;

	public ExtendedFizzBuzzTranslator(ArrayList<String> words , ArrayList<Integer> numbers) {
		this.words = words;
		this.numbers = numbers;
	}

	public String applyRules(int number) {
		String result = "";

		for (int i = 0; i < words.size(); i++){
			if (number % numbers.get(i) == 0){
				result += words.get(i);
			}
		}
		if (result.equals("")){
			result = String.valueOf(number);
		}
		return result;
	}
}