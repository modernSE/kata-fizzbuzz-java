package fizzbuzz.Translater;

import java.util.List;

public class TranslaterStrategy {
    private static Translater defaultTranslater = new DefaultTranslater();

    private static List<TranslationBundle> translators = List.of(
        new TranslationBundle(new FooTranslater(), new FooTranslater()),
        new TranslationBundle(new FizzBuzzTranslater(), new FizzBuzzTranslater()),
        new TranslationBundle(new FizzTranslater(), new FizzTranslater()),
        new TranslationBundle(new BarTranslater(), new BarTranslater()), 
        new TranslationBundle(new BuzzTranslater(), new BuzzTranslater())
    );

    public String translate(int value) {
        for(TranslationBundle t : translators) {
            if (t.checker.shouldTranslate(value)) return t.translater.translation(value);
        }
        return defaultTranslater.translation(value);
    }

    private record TranslationBundle(TranslationChecker checker, Translater translater){
    };
}
