package fizzbuzz;

import java.util.Optional;

public class InputOutputBuzz implements IInputOutput {

    @Override
    public Optional<String> resolve(int number) {
        if (((number % 7) == 0))
            return Optional.of("Buzz");

        return Optional.empty();
    }

}
