package data.dto;

import java.util.List;
import java.util.Objects;

public class InstructionsForCalculator {

    private final List<InstructionRow> instructionRows;
    private final int applyOn;

    public InstructionsForCalculator(List<InstructionRow> instructionRows, int applyOn) {
        this.instructionRows = instructionRows;
        this.applyOn = applyOn;
    }

    public List<InstructionRow> getInstructionRows() {
        return instructionRows;
    }

    public int getApplyOn() {
        return applyOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstructionsForCalculator that = (InstructionsForCalculator) o;
        return getApplyOn() == that.getApplyOn() && Objects.equals(getInstructionRows(), that.getInstructionRows());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInstructionRows(), getApplyOn());
    }
}
