package fizzbuzz;
public class FizzRule implements Rule{
    @Override
    public String check(String number){
        return (Integer.valueOf(number) % 7) == 0 ? "Fizz" : "";
    }
}
