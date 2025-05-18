import com.own.training.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedCalculatorTests {

    Calculator cj;

    @BeforeEach
    public void setup(){
        cj = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "-1, -2, -3",
            "100, 200, 300",
            "0, 0, 0"
    })
    public void addTest(int a, int b, int expected ){
        int res = cj.add(a,b);
        assertEquals(res, expected);
    }
}
