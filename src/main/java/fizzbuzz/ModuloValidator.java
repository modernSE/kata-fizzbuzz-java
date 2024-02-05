package fizzbuzz;

import java.util.List;

public class ModuloValidator implements Validator {

    @Override
    public boolean isValid(int number, List<Integer> validModuls) {
        for(Integer validModulo: validModuls){
            if(number % validModulo == 0){
                return true;
            }
        }
        return false; 
    }

    
    
}
