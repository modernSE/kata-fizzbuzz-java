package fizzbuzz;

public class ContainsBuzzer implements Buzzer{
    private String buzzword;
    private int containedNumber;
    public ContainsBuzzer(String buzzword, int containedNumber){
        this.buzzword = buzzword;
        this.containedNumber = containedNumber;
    }

    public String translate(int number){
        if (String.valueOf(number).contains(String.valueOf(containedNumber)))
			return buzzword;
		else
			return "";
    }
}
