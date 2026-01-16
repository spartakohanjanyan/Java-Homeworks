package homework11526;

public class task2 {
    public static void main(String[] args){

        int[] numbers = {11, 3, 44, 3, 55, 34 ,23};

        boolean found = false;

        for (int idx = 1; idx < numbers.length - 1; idx++) {

            if (numbers[idx - 1] == numbers[idx + 1]) {
                System.out.println("Founded index " + idx);
                found = true;
                break;

            }
        }
        if (!found){
             System.out.println("No mirror index");
         }

   }
}

