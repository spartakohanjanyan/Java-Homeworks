package homework11826;

public class FindSecondLargest {
    public static void main(String[] args) {
        int [] array = {3 ,6 ,4 ,8 ,9 ,14 ,23 ,5};

        int largest = array[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest) {
                secondLargest = array[i];
            }

        }
        System.out.println("second largest is :" + secondLargest);

    }
}
