package fizzbuzz;

public class Numbers {
    static boolean containsDigit(int number, int digit){{
      while(number > 0)
      {
          if(number % 10 == digit)
              return true;

          number=number/10;
      }
      return false; 
    }
}}
