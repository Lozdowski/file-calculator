package calculator.domain.strategy;

class Divide implements Calculator{

    @Override
    public int calculate(int applyOn, int apply) {
        return applyOn / apply;
    }
}
