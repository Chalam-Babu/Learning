import com.own.training.Addition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdditionTest {
    @Test
    public void addTest() {
        Addition a = new Addition();
        int res = a.add(6, 7);
        assertEquals(13, res);
    }

    @Test
    public void addTest2() {
        Addition a = new Addition();
        int res = a.add(-6, 7);
        assertEquals(1, res);
    }
    @Test
    public void subTest(){
        Addition a  = new Addition();
        int res = a.sub(7,5);
        assertEquals(2,res);
    }


    @Test
    public void equalsTest(){
        Addition a = new Addition();
        int res  = a.isPositive(7);
        assertTrue(res > 0);

    }
}
