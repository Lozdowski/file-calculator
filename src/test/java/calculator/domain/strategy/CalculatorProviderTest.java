package calculator.domain.strategy;

import calculator.exception.NoSuchInstructionCalculatorStrategyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorProviderTest {

    private static final String ADDTION = "add";
    private static final String MULTIPLY = "multiply";
    private static final String NOT_SUPPORTED_INSTRUCTION = "not supported instruction";

    private CalculatorProvider calculatorProvider;

    @BeforeEach
    void setUp() {
        calculatorProvider = new CalculatorProvider();
    }

    @Test
    public void findWillReturnAddtionCalculator() {
        //when
        Calculator result = calculatorProvider.find(ADDTION);
        //then
        assertTrue(result instanceof Addition);
    }

    @Test
    public void findWillReturnMultiplyCalculator() {
        //when
        Calculator result = calculatorProvider.find(MULTIPLY);
        //then
        assertTrue(result instanceof Multiply);
    }

    @Test
    public void findWillThrowNoSuchInstructionCalculatorStrategyException() {
        assertThrows(NoSuchInstructionCalculatorStrategyException.class,
                () -> calculatorProvider.find(NOT_SUPPORTED_INSTRUCTION));
    }
}