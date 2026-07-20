package fizzbuzz;

import java.util.Optional;

public class InputOutputBar implements IInputOutput {

    @Override
    public Optional<String> resolve(int number) {
        if (Numbers.containsDigit(number, 3))
            return Optional.of("Bar");

        return Optional.empty();
    }
    
}