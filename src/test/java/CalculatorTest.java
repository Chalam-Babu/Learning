import com.own.training.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator cj;
    @BeforeEach
    public void setup(){
        cj = new Calculator();

    }


    @Test
    public void addTest(){
        int res = cj.add(6, 10);
        assertEquals(16, res);
    }

    @Test
    public void negativeAddTest(){
        int res = cj.add(-6,-10);
        assertEquals(-16, res);
    }


    @Test
    public void divideTest(){
        int res = cj.divide(4, 2);
        assertEquals(2, res);
    }
}
