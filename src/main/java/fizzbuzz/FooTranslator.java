package fizzbuzz;

import java.util.List;
import java.util.Optional;

public class FooTranslator implements Translator{
    List<Integer> divisors;
    String word;

    public FooTranslator(List<Integer> divisors, String word){
        this.divisors = divisors;
        this.word = word;
    }

    @Override
    public String translate(int number){
        Optional<Boolean> opt = divisors.stream().map(divisor -> (number % divisor) == 0).filter(value -> !value).findAny();
        if(opt.isPresent()) {
            return word;
        } else {
            return "";
        }
    }
}
