package fizzbuzz.Translater;

public class DefaultTranslater implements Translater {
    @Override
    public String translation(int number) {
        return String.valueOf(number);
    }  

}