package homework11826;

public class task2 {
    public static void main(String[] args){
        int[] array1 = {10, -9, 3, -118, 4, -12, -6};

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                count++;
            }
        }

        int[] array2 = new int [count];

        int idx = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                array2[idx] = array1[i];
                idx++;
            }
        }

        System.out.print("array2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }


}


