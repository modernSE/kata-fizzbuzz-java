//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

	//openClosed verletzt -> nicht erweiterbar für extension

	public String translate(int number) {

		String result = "";
		boolean needsDefault = true;

		var fooValidator = new FooValidator();
		var fizzValidator = new FizzValidator();
		var barValidator = new BarValidator();
		var buzzValidator = new BuzzValidator();
		
		List<Validator> validators = Arrays.asList(fooValidator,fizzValidator,barValidator,buzzValidator );		

		for (Validator validator : validators) {
			if (validator.validate(number)){
				result += validator.getTranslation();				
				needsDefault = false;
			}
		}

		return needsDefault ? String.valueOf(number) : result;
			
	}

	public interface Validator{
		public boolean validate(int number);
		public String getTranslation();		
	}

	public class FizzValidator implements Validator{

		@Override
		public boolean validate(int number) {			
			return ((number % 5) == 0); // else a multiple of 5?
		}

		@Override
		public String getTranslation() {			
			return "Fizz";
		}
	}

	public class BuzzValidator implements Validator{

		@Override
		public boolean validate(int number) {			
			return ((number % 7) == 0); // else a multiple of 7?
		}

		@Override
		public String getTranslation() {			
			return "Buzz";
		}
	}

	public class FooValidator implements Validator{

		@Override
		public boolean validate(int number) {			
			return ((number % 6) == 0 || (number % 7) == 0 );
		}

		@Override
		public String getTranslation() {			
			return "Foo";
		}
	}

	public class BarValidator implements Validator{

		@Override
		public boolean validate(int number) {		
			return String.valueOf(number).contains("3");			
		}

		@Override
		public String getTranslation() {			
			return "Bar";
		}
	}

}