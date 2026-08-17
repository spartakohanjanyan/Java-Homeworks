import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest {

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();

        int result = calculator.divide(20, 5);

        Assert.assertEquals(result, 4);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();

        calculator.divide(10, 0);
    }
}