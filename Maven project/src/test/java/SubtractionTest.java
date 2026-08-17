import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTest {

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(10, 5);

        Assert.assertEquals(result, 5);
    }

    @Test
    public void testSubtractionNegativeResult() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(5, 10);

        Assert.assertEquals(result, -5);
    }
}