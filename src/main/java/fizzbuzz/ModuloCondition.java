package fizzbuzz;

public class ModuloCondition implements Condition {

    private final int moduloNumber;

    public ModuloCondition(int moduloNumber){
        this.moduloNumber = moduloNumber;
    }

    @Override
    public boolean evaluate(int input) {
        return input % this.moduloNumber == 0;
    }
    
}
