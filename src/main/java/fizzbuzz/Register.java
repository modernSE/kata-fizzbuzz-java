package fizzbuzz;

import java.util.LinkedList;
import java.util.List;

public class Register {
    
    public Register(FizzBuzz fizzBuzz) {
        BuzzWord buzz = new Buzz();
        BuzzWord fizz = new Fizz();
        List<BuzzWord> buzzwords = new LinkedList();

        buzzwords.add(fizz);
        buzzwords.add(buzz);

        fizzBuzz.setList(buzzwords);

    }

}