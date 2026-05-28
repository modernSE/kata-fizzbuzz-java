package fizzbuzz.Translater;

public class BuzzTranslater implements Translater {

    @Override
    public boolean shouldTranslate(int number) {
        return ((number % 7) == 0);
    }

    @Override
    public String translation(int number) {
        return "Buzz";
    }
}