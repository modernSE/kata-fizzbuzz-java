package fizzBuzz;

public class BarTranslator implements Translator {

	@Override
	public String translate(int number) {
		String translation = "";
		if (has3inIt(number)) {
			translation = "Bar";
		}
		return translation;
	}
	
	private boolean has3inIt(int number)
	{
		while (number > 0)
		{
			if (number % 10 == 3)
				return true;
			number /= 10;
		}
		return false;
	}

}
