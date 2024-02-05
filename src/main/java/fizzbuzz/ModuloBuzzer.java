package fizzbuzz;

public class ModuloBuzzer implements Buzzer{
    private String buzzword;
    private int divider;
    public ModuloBuzzer(String buzzword, int divider){
        this.buzzword = buzzword;
        this.divider = divider;
    }

    public String translate(int number){
        if ((number % divider) == 0)
			return buzzword;
		else
			return "";
    }
}
