package calculator.domain.strategy;

class Subtract implements Calculator{

    @Override
    public int calculate(int applyOn, int apply) {
        return applyOn - apply;
    }
}
