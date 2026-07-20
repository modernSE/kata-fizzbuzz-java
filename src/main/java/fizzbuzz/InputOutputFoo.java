package fizzbuzz;

import java.util.Optional;

public class InputOutputFoo implements IInputOutput {

    @Override
    public Optional<String> resolve(int number) {
        if (((number % 6) == 0) || ((number % 7) == 0))
            return Optional.of("Foo");

        return Optional.empty();
    }
    
}