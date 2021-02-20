package calculator.domain.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyTest {

    private Multiply multiply;

    @BeforeEach
    void setUp(){
        multiply = new Multiply();
    }

    @Test
    public void calculateWillMultiply(){
        //when
        int result = multiply.calculate(20, 3);
        //then
        assertEquals(result, 60);
    }

}