package calculator.domain.strategy;


import calculator.exception.NoSuchInstructionCalculatorStrategyException;

import java.util.HashMap;
import java.util.Map;

public class CalculatorProvider {

    final private Map<MathOperation, Calculator> operations;

    public CalculatorProvider() {
        Map<MathOperation, Calculator> mapz =new HashMap<>();
        mapz.put(MathOperation.ADD, new Addition());
        mapz.put(MathOperation.SUBTRACT, new Subtract());
        mapz.put(MathOperation.MULTIPLY, new Multiply());
        mapz.put(MathOperation.DIVIDE, new Divide());
        this.operations = mapz;
    }

    public Calculator find(String operation){
        return this.operations.keySet().stream()
                .filter(key -> key.getCode().equals(operation))
                .findFirst()
                .map(operations::get)
                .orElseThrow(() -> new NoSuchInstructionCalculatorStrategyException("File contains not supported instruction: " + operation));
    }
}
