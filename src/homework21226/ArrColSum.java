package homework21226;

public class ArrColSum {
    public static void main(String[] args){

         int[][] matrix = {
                        {6, 5, 9, 7},
                        {6, 7, 1, 4},
                        {2, 2, 4, 3}
                };


                int firstColSum = 0;
                for (int i = 0; i < matrix.length; i++) {
                    firstColSum += matrix[i][0];
                }

                boolean allEqual = true;

                for (int j = 1; j < matrix[0].length; j++) {
                    int currentSum = 0;
                    for (int i = 0; i < matrix.length; i++) {
                        currentSum += matrix[i][j];
                    }

                    if (currentSum != firstColSum) {
                        allEqual = false;
                        break;
                    }
                }

                if (allEqual) {
                    System.out.println("All columns sums are equal:  " + firstColSum);
                } else {
                    System.out.println("All columns sums aren't equal: ");
                }

    }
}

