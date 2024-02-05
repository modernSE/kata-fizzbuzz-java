package fizzbuzz;

import java.util.List;

public enum FizzBuzzMappingEnum {
    FOO ("Foo", List.of(6,7), new ModuloValidator()),
    FIZZ ("Fizz", List.of(5), new ModuloValidator()),
    BAR ("Bar", List.of(3), new ContainsValidator()),
    BUZZ( "Buzz", List.of(7), new ModuloValidator());
    
    public String translation;
    public List<Integer> numbers;
    public Validator validator;

    FizzBuzzMappingEnum(String translation, List<Integer> numbers, Validator validator){
        this.translation = translation; 
        this.numbers = numbers;
        this.validator = validator;
    }

}
