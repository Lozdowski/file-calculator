package data;

import data.dto.InstructionRow;
import data.dto.InstructionsForCalculator;
import data.exception.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class InstructionsProviderTest {


    private static final String SRC_MAIN_RESOURCES_CALC_1_TXT = "src/main/resources/calc1.txt";
    private static final String PATH_TO_INVALID_FILE = "src/main/resources/missingApplyInstruction.txt";
    private static final String PATH_TO_MISSING_FILE = "NO FILE";
    private static final String INSTRUCTION_ROW_STRING1 = "add 4";
    private static final String INSTRUCTION_ROW_STRING2 = "multiply 5";
    private static final int APPLY_ON = 10;
    private InstructionsProvider instructionsProvider;

    @BeforeEach
    void setUp(){
        instructionsProvider = new InstructionsProvider();
    }

    @Test
    public void readInstructionsForCalculatorFromFileWillReturnInstructionsForCalculatorthrows() throws FileNotFoundException {
        //when
        InstructionsForCalculator instructionsForCalculator =
                instructionsProvider.readInstructionsForCalculatorFrom(SRC_MAIN_RESOURCES_CALC_1_TXT);
        //then
        assertEquals(instructionsForCalculator, provideInstructionsForCalculator());
    }

    @Test
    public void readInstructionsForCalculatorFromFileWillThrowInvalidInputException() throws FileNotFoundException {
        //when
        assertThrows(InvalidInputException.class, () -> instructionsProvider.readInstructionsForCalculatorFrom(PATH_TO_INVALID_FILE));
    }

    @Test
    public void readInstructionsForCalculatorFromFileWillThrowFileNotFoundException() throws FileNotFoundException {
        //when
        assertThrows(FileNotFoundException.class, () -> instructionsProvider.readInstructionsForCalculatorFrom(PATH_TO_MISSING_FILE));
    }

    private InstructionsForCalculator provideInstructionsForCalculator(){
        List<InstructionRow> instructionRows = provideInstructionRows();
        return new InstructionsForCalculator(instructionRows, APPLY_ON);
    }
    private List<InstructionRow> provideInstructionRows(){
        InstructionRow row1 =  InstructionRow.of(INSTRUCTION_ROW_STRING1);
        InstructionRow row2 =  InstructionRow.of(INSTRUCTION_ROW_STRING2);
        return Arrays.asList(row1, row2);
    }
}