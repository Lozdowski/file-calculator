package data;

import data.dto.InstructionRow;
import data.exception.InvalidInputException;

class ApplyOn {

    private static final String APPLY = "apply";
    private static final String ERROR_MESSAGE = "Last row of file does not contain 'apply X' instruction. Please check input file carefully.";
    private final int value;

    public static ApplyOn of(InstructionRow instructionRow) {
        if (!instructionRow.getOperationType().equals(APPLY)) {
            throw new InvalidInputException(ERROR_MESSAGE);
        }
        return new ApplyOn(instructionRow.getValue());
    }

    private ApplyOn(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
