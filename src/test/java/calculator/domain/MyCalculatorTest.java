package calculator.domain;

import data.dto.InstructionRow;
import data.dto.InstructionsForCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCalculatorTest {

    private static final String INSTRUCTION_ROW_STRING_ADD1 = "add 3";
    private static final String INSTRUCTION_ROW_STRING_ADD2 = "multiply 10";
    private static final String INSTRUCTION_ROW_STRING_ADD3 = "subtract 3";
    private static final int APPLY_ON = 2;
    private MyCalculator myCalculator;

    @BeforeEach
    void setUp(){
        myCalculator = new MyCalculator();
    }

    @Test
    public void runWillReturnResultWithValidInputFile() {
        //given
        InstructionsForCalculator instructionsForCalculator = provideInstructionsForCalculator();
        //when
        int result = myCalculator.run(instructionsForCalculator);
        //then
        assertEquals(47, result);
    }

    private InstructionsForCalculator provideInstructionsForCalculator(){
        List<InstructionRow> instructionRows = provideInstructionRows();
        return new InstructionsForCalculator(instructionRows, APPLY_ON);
    }

    private List<InstructionRow> provideInstructionRows(){
        InstructionRow row1 =  InstructionRow.of(INSTRUCTION_ROW_STRING_ADD1);
        InstructionRow row2 =  InstructionRow.of(INSTRUCTION_ROW_STRING_ADD2);
        InstructionRow row3 =  InstructionRow.of(INSTRUCTION_ROW_STRING_ADD3);
        return Arrays.asList(row1, row2, row3);
    }

}