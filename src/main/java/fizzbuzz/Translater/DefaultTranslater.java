package fizzbuzz.Translater;

public class DefaultTranslater implements Translater {

    @Override
    public boolean shouldTranslate(int number) {
        return true;
    }

    @Override
    public String translation(int number) {
        return String.valueOf(number);
    }  

}