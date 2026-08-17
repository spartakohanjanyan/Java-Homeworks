import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest {

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(5, 4);

        Assert.assertEquals(result, 20);
    }

    @Test
    public void testMultiplicationByZero() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(10, 0);

        Assert.assertEquals(result, 0);
    }
}