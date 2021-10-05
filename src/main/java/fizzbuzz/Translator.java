package fizzbuzz;

import java.util.List;

public class Translator implements Checker, ITranslator {
    private List<Checker> checkers;
    private String name;

    public Translator(String name, List<Checker> checkers){
        this.name = name;
        this.checkers = checkers;
    }

    public boolean shouldTranslate(int number){
        return checkers.stream().map(checker -> checker.shouldTranslate(number)).reduce(true, Boolean::logicalAnd);
    }

    public String translate(){
        return this.name;
    }
}

