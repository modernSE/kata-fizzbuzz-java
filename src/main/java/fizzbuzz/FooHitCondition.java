package fizzbuzz;

class FooHitCondition implements HitCondition {

    private static final String HIT_WORD = "Foo";

    
    @Override
    public boolean isHit(int number) {
        return (number % 6) == 0 || (number % 7) == 0;
    }

    @Override
    public String getHitWord() {
        return HIT_WORD;
    }

}