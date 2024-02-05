//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;

public class FizzBuzz {

	public String translate(int number) {
		ModuloBuzzer fiveBuzzer = new ModuloBuzzer("Fizz", 5);
		ModuloBuzzer sevenBuzzer = new ModuloBuzzer("Buzz", 7);
		List<Buzzer> buzzers = List.of(fiveBuzzer, sevenBuzzer);
		String translation = "";
		for (Buzzer buzzer: buzzers){
			translation += buzzer.translate(number);
		}
		return translation.isBlank() ? String.valueOf(number) : translation;
	}
}