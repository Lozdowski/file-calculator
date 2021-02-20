package calculator.domain.strategy;

enum MathOperation {

    ADD("add"),
    MULTIPLY("multiply"),
    SUBTRACT("subtract"),
    DIVIDE("divide");

    private final String code;

    MathOperation(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
