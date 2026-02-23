package homework22226;

public class MatrixRowGen {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        generateMatrix(arr);
    }

        public static int[][] generateMatrix(int[] array) {
            int n = array.length;
            int[][] matrix = new int[n][n];

            for (int j = 0; j < n; j++) {
                matrix[0][j] = array[j];
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = matrix[i - 1][j] + 1;
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + ",");
                }
                System.out.println();
            }

            return matrix;
        }

}

