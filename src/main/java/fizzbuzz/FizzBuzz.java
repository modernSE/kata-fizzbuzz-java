//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;

public class FizzBuzz {

	public String translate(int number) {
		ModuloBuzzer sixBuzzer = new ModuloBuzzer("Foo", 6);
		ModuloBuzzer sevenBuzzerFoo = new ModuloBuzzer("Foo",7);
		ModuloBuzzer fiveBuzzer = new ModuloBuzzer("Fizz", 5);
		ContainsBuzzer threeBuzzer = new ContainsBuzzer("Bar", 3);
		ModuloBuzzer sevenBuzzer = new ModuloBuzzer("Buzz", 7);
		List<Buzzer> buzzers = List.of( sixBuzzer, sevenBuzzerFoo,fiveBuzzer, threeBuzzer, sevenBuzzer);
		String translation = "";
		for (Buzzer buzzer: buzzers){
			translation += buzzer.translate(number);
		}
		return translation.isBlank() ? String.valueOf(number) : translation;
	}
}