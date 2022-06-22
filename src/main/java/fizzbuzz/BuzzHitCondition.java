package fizzbuzz;

class BuzzHitCondition implements HitCondition {

    private static final String HIT_WORD = "Buzz";

    
    @Override
    public boolean isHit(int number) {
        return (number % 7) == 0;
    }

    @Override
    public String getHitWord() {
        return HIT_WORD;
    }

}