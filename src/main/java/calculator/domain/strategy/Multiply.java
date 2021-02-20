package calculator.domain.strategy;

class Multiply implements Calculator{

    @Override
    public int calculate(int applyOn, int apply) {
        return applyOn * apply;
    }
}
