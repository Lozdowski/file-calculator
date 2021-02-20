package calculator.domain.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractTest {

    private Subtract subtract;

    @BeforeEach
    void setUp(){
        subtract = new Subtract();
    }

    @Test
    public void calculateWillSubtract(){
        //when
        int result = subtract.calculate(20, 15);
        //then
        assertEquals(5, result);
    }

}