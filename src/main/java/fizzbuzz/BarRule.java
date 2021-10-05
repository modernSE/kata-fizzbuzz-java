package fizzbuzz;

public class BarRule implements Rule{

    @Override
    public int getOrder() {
        return 3;
    }

    @Override
    public String evaluate(int number) {
        return String.valueOf(number).contains("3") ? "Bar" : null;
    }
    
}
