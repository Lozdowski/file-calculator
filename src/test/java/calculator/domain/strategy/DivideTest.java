package calculator.domain.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivideTest {

    private Divide divide;

    @BeforeEach
    void setUp(){
        divide = new Divide();
    }

    @Test
    public void calculateWillDivide1(){
        //when
        int result = divide.calculate(20, 5);
        //then
        assertEquals(4, result);
    }

    @Test
    public void calculateWillDivide2(){
        //when
        int result = divide.calculate(4, 4);
        //then
        assertEquals(result, 1);
    }
}