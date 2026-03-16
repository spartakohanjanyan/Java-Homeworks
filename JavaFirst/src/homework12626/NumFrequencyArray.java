package homework12626;

public class NumFrequencyArray {
    public static void main(String[] args) {

        int[] numbers = {7, 12, 7, 0, 1000, 590, 12, 7, 12};
        int[] counts = new int[1001];

        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            counts[value]++;
        }

        for (int idx = 0; idx < counts.length; idx++) {
            if (counts[idx] > 0) {
                System.out.println("Num " + idx + " : " + counts[idx]);
            }
        }



    }
}
