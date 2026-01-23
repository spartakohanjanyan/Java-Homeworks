package homework11826;

public class ArrayToNum {
    public static void main(String[] args){
        int[] array = {3, 4, 7, 9};

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result = (result * 10) + array[i];
        }

        System.out.println("Num is: " + result);
    }
}
