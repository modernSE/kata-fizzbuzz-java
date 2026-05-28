package fizzbuzz;

public class BarTranslator implements Translator{
    private int digit;
    private String word;

    public BarTranslator(int digit, String word){
        this.digit = digit;
        this.word = word;
    }

    @Override
    public String translate(int number){
        if(Integer.toString(number).contains(String.valueOf(digit))){
            return word;
        } else {
            return "";
        }
        
    }
}
