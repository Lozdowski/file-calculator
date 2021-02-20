package data.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructionRowTest {

    private static final String INSTRUCTION_ROW_FROM_FILE = "apply 2";
    private static final String INSTRUCTION = "apply";
    private static final int VALUE = 2;

    @Test
    public void ofWillReturnInstrucionRow(){
        //when
        InstructionRow result = InstructionRow.of(INSTRUCTION_ROW_FROM_FILE);
        //then
        assertEquals(result.getOperationType(), INSTRUCTION);
        assertEquals(result.getValue(), VALUE);
    }

}