package fizzbuzz;

class BarHitCondition implements HitCondition {

    private static final String HIT_WORD = "Bar";

    
    @Override
    public boolean isHit(int number) {
        return String.valueOf(number).contains("3");
    }

    @Override
    public String getHitWord() {
        return HIT_WORD;
    }

}