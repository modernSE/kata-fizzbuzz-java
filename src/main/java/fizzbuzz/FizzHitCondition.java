package fizzbuzz;

class FizzHitCondition implements HitCondition {

    private static final String HIT_WORD = "Fizz";
    

    @Override
    public boolean isHit(int number) {
        return (number % 5) == 0;
    }

    @Override
    public String getHitWord() {
        return HIT_WORD;
    }

}