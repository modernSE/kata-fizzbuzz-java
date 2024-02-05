package fizzbuzz;

public class Translator {

    private ITranslator translator;

    public Translator(ITranslator translator){
        this.translator = translator;
    }

    public String translate(int number){
        return translator.applyRules(number);
    }   
}
