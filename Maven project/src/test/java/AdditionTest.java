import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest {

    @Test
    public void testAdditionPositiveNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(10, 5);

        Assert.assertEquals(result, 15);
    }

    @Test
    public void testAdditionNegativeNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(-10, -5);

        Assert.assertEquals(result, -15);
    }
}