//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

	public String translate(int number) {
		String ret = "";
		if (((number % 6) == 0) || ((number % 7) == 0)) {
			ret += "Foo";
		}
		if ((number % 5) == 0) {
			ret += "Fizz";
		}
		if(String.valueOf(number).contains(String.valueOf(3))) {
			 ret += "Bar";
		}
		if ((number % 7) == 0) {
			ret += "Buzz";
		}
		
		if (ret == "") {
			return String.valueOf(number);
		} else {
			return ret;
		}
	}
}