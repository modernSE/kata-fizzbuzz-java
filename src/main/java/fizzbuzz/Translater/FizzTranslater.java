package fizzbuzz.Translater;

public class FizzTranslater implements Translater, TranslationChecker {

    @Override
    public boolean shouldTranslate(int number) {
        return ((number % 5) == 0);
    }

    @Override
    public String translation(int number) {
        return "Fizz";
    }

    

}