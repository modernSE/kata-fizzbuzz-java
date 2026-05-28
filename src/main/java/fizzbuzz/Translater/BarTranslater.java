package fizzbuzz.Translater;

public class BarTranslater implements Translater {

    @Override
    public boolean shouldTranslate(int number) {
        return String.valueOf(number).contains("3");
    }

    @Override
    public String translation(int number) {
        return "Bar";
    }

    

}