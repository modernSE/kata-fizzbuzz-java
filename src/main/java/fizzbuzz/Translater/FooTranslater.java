package fizzbuzz.Translater;

public class FooTranslater implements Translater {

    @Override
    public boolean shouldTranslate(int number) {
        return (((number % 6) == 0) || ((number % 7) == 0));
    }

    @Override
    public String translation(int number) {
        return "Foo";
    }

    

}