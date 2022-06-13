//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

	private final FizzChecker fizzChecker;
	private final BuzzChecker buzzChecker;

	public FizzBuzz(FizzChecker fizzChecker, BuzzChecker buzzChecker) {
		this.fizzChecker = fizzChecker;
		this.buzzChecker = buzzChecker;
	}

	public String translate(int number) {

		String res = "";

		res += fizzChecker.check(number);
		res += buzzChecker.check(number);

		if(res.equals(""))
			res = String.valueOf(number);

		return res;
	}
}