package homeworklistsumcalculator;

import java.util.List;

public class ListSumCalculator {

    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }
}
