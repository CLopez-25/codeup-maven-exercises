import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void additionMethodTest() {
        int input1 = 20;
        int input2 = 30;
        int expected = 50;
        assertEquals(expected, MathOperations.add(input1, input2));
    }

    @Test
    public void tipAppTest() {
        double cost = 22.56;
        double tip = 20;

        assertEquals(4.51, MathOperations.tip(cost, tip), 0.05);
    }

}
