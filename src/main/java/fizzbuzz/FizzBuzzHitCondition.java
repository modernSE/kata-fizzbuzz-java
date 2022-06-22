package fizzbuzz;

class FizzBuzzHitCondition implements HitCondition {

    private static final String HIT_WORD = "FizzBuzz";

    
    @Override
    public boolean isHit(int number) {
        return (number % 5) == 0 && (number % 7) == 0;
    }

    @Override
    public String getHitWord() {
        return HIT_WORD;
    }

}