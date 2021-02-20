package calculator.domain.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    Addition addition;

    @BeforeEach
    void setUp(){
        addition = new Addition();
    }

    @Test
    public void calculate(){
        //when
        int result = addition.calculate(10, 20);
        //then
        assertEquals(30, result);
    }
}