package fizzbuzz;

import java.util.Optional;

public class InputOutputFizz implements IInputOutput {

    @Override
    public Optional<String> resolve(int number) {
        if (((number % 5) == 0))
            return Optional.of("Fizz");

        return Optional.empty();
    }
    
}
