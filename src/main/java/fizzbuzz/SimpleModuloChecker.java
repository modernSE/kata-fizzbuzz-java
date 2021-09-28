package fizzbuzz;

public class SimpleModuloChecker implements Checker{
    private int base;

    public SimpleModuloChecker(int base){
        this.base = base;
    }

    public boolean shouldTranslate(int number){
        return number % base == 0;
    }
}
