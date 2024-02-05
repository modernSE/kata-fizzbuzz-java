package fizzbuzz;

import java.util.List;

public class ContainsValidator implements Validator {

    @Override
    public boolean isValid(int number, List<Integer> validNumbers) {
        String numberAsString = String.valueOf(number);
        for(Integer validNumber: validNumbers){
            if(numberAsString.contains(String.valueOf(validNumber))){
                return true;
            }
        }
        return false; 
    }

    
    
}
