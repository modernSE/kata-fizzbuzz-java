package fizzbuzz;

public class BuzzRule implements Rule {
    @Override
    public String check(String number){
        return (Integer.valueOf(number) % 5) == 0 ? "Buzz" : "";
    }
}
