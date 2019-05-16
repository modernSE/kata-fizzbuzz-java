//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzBuzz;

import java.util.ArrayList;
import java.util.Collection;

public class FizzBuzz {
	
	// +2
	private Collection<INumberChecker> numberCheckers;
	
	public FizzBuzz() {
		numberCheckers = new ArrayList<>();
	}
	
	public void addChecker(INumberChecker checker) {
		this.numberCheckers.add(checker);
	}

	public String translate(int number) {
		
		StringBuilder resultBuilder = new StringBuilder();
		
		for(INumberChecker checker: numberCheckers) {
			if(checker.checkNumber(number)) {
				resultBuilder.append(checker.translate());
			}
		}
		String result = resultBuilder.toString();
		if (result.isEmpty()) {
			return String.valueOf(number);
		}
		return result;
	}
}