package homework11526;

public class task3 {
    public static void main(String[] args){

        int[] numbers = {3, 6, -3, 9, -1, 14, 21, 20};

        int lastPositive = Integer.MIN_VALUE;
        boolean violated = false;

        for (int idx = 0; idx < numbers.length; idx++) {
            if (numbers[idx] < 0) {
                continue;
            }

            if (numbers[idx] <= lastPositive) {
                System.out.println("Violated index is " + idx);
                violated = true;
                break;
            }

            lastPositive = numbers[idx];
        }

        if (!violated) {
            System.out.println("OK");
        }
    }
}


