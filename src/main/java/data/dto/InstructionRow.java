package data.dto;

import java.util.Objects;

public class InstructionRow {

    private final String operationType;
    private final int value;

    public static InstructionRow of(String fileLineString) {
        return createInstructionRowObjectFromString(fileLineString);
    }

    public String getOperationType() {
        return operationType;
    }

    public int getValue() {
        return value;
    }

    private static InstructionRow createInstructionRowObjectFromString(String fileLineString) {
        String[] arr = fileLineString.trim().split(" ");
        String operationToInvoke = arr[0];
        int value = Integer.parseInt(arr[1]);
        return new InstructionRow(operationToInvoke, value);
    }

    private InstructionRow(String operationType, int value) {
        this.operationType = operationType;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstructionRow that = (InstructionRow) o;
        return getValue() == that.getValue() && Objects.equals(getOperationType(), that.getOperationType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOperationType(), getValue());
    }
}
