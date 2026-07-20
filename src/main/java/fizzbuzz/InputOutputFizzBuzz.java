package fizzbuzz;

import java.util.Optional;

public class InputOutputFizzBuzz implements IInputOutput {

    @Override
    public Optional<String> resolve(int number) {
        if (((number % 5) == 0) && ((number % 7) == 0)) // A multiple of both?
            return Optional.of("FizzBuzz");

        return Optional.empty();
    }

}
