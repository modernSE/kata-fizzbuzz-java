package fizzbuzz;

import java.util.Comparator;

public interface Rule {

    int getOrder();

    String evaluate(int number);
}