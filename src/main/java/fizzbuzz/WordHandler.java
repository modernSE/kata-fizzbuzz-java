//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class WordHandler {

	public String translate(int number) {
		Foo fooer = new Foo();
		Fizz fizzer = new Fizz();
		Bar barrer = new Bar();
		Buzz buzzer = new Buzz();

		String fooerResult = fooer.translate(number);
		String fizzerResult = fizzer.translate(number);
		String barrerResult = barrer.translate(number);
		String buzzerResult = buzzer.translate(number);

		String result = fooerResult + fizzerResult + barrerResult + buzzerResult;
		if(result.isEmpty()) return String.valueOf(number);
		return result;
	}
}