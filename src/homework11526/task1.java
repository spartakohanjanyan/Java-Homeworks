package homework11526;

public class task1 {
    public static void main(String[] args) {

        int[] numbers = {13, 1, 21, 3, 44, 5, 65, 7, 33, 55};

        int sum = 0;

        for (int numIdx = 0; numIdx < numbers.length; numIdx++) {
            if (numbers[numIdx] == numIdx) {
                System.out.println("num" + numIdx);
                continue;
            }

            sum += numbers[numIdx];

            if (sum > 100) {
                System.out.println("stop sum is greater than 100");
                break;
            }
        }
        System.out.println("Sum is " + sum);
    }
}