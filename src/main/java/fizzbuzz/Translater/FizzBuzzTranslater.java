package fizzbuzz.Translater;

public class FizzBuzzTranslater implements Translater, TranslationChecker {

    @Override
    public boolean shouldTranslate(int number) {
        return (((number % 5) == 0) && ((number % 7) == 0));
    }

    @Override
    public String translation(int number) {
        return "FizzBuzz";
    }

}