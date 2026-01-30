package homework12626;

public class MatrixColumn {
    public static void main(String[] args) {

        int[][] matrix = {
                {4, 2, 7, 6},
                {1, 9, 6, 3},
                {7, 8, 1, 2},
                {5, 3, 8, 3}

        };

        int m = matrix.length;
        int n = matrix[0].length;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
