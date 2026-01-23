package homework11826;

public class FindLastNegative {
    public static void main(String[] args){
        int[] array = {3 ,-4, 243 ,6, 23, -2, 3};
        int index = -1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 0) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("No negative number: ");
        } else {
            System.out.println("Last negative number:  " + array[index]);
            System.out.println("Index: " + index);
        }

    }
}
