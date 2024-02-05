package fizzbuzz;

public class FooRule implements Rule{
    @Override
    public String check(String number){
        return modulo(number, 6) || modulo(number, 7) ? "Foo" : "";
    }

    private boolean modulo(String number, Integer modulo){
        return (Integer.valueOf(number) % modulo) == 0;
    }
}
