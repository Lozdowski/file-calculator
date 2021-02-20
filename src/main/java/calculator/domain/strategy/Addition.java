package calculator.domain.strategy;

class Addition implements Calculator{

    @Override
    public int calculate(int applyOn, int apply) {
        return applyOn + apply;
    }
}
