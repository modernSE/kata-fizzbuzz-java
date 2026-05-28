package fizzbuzz;

public class FizzBuzzTranslator implements Translator {
    private int divisor;
    private String word;

    public FizzBuzzTranslator(int divisor, String word){
        this.divisor = divisor;
        this.word = word;
    }

    @Override
    public String translate(int number){
        if((number % divisor) == 0){
            return word;
        }
        return "";
    }
}
