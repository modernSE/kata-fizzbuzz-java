package fizzbuzz.Translater;

import java.util.List;

public class TranslaterStrategy {
    private static Translater defauTranslater = new DefaultTranslater();

    private static List<Translater> translators = List.of(
        new FizzBuzzTranslater(), 
        new FizzTranslater(), 
        new BuzzTranslater()
    );

    public String translate(int value) {
        for(Translater t : translators) {
            if (t.shouldTranslate(value)) return t.translation(value);
        }
        return defauTranslater.translation(value);
    }
}
