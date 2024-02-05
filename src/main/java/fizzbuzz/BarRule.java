package fizzbuzz;

public class BarRule implements Rule{
    @Override
    public String check(String number){
        return number.contains("3") ? "Bar" : "";
    }
}
