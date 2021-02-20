package calculator.domain;

import calculator.domain.strategy.Calculator;
import calculator.domain.strategy.CalculatorProvider;
import data.dto.InstructionRow;
import data.dto.InstructionsForCalculator;

import java.util.List;

public class MyCalculator {

    private final CalculatorProvider calculatorProvider;

    public MyCalculator() {
        this.calculatorProvider = new CalculatorProvider();
    }

    public int run(InstructionsForCalculator instructions) {
        return getResultFromInstruction(instructions.getInstructionRows(), instructions.getApplyOn());

    }

    private int getResultFromInstruction(List<InstructionRow> instructionRows, int applyOn) {
        if(instructionRows.isEmpty()){
            return applyOn;
        }
        for(InstructionRow instruction : instructionRows){
            Calculator calc = calculatorProvider.find(instruction.getOperationType());
            applyOn = calc.calculate(applyOn, instruction.getValue());
        }
        return applyOn;
    }
}
