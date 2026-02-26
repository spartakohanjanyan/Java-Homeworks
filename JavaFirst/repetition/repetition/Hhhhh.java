package repetition;

public class Hhhhh {
    public static void main(String[] args){

            // 1. Ավելացվեց [][] և int, որպեսզի զանգվածը ճանաչվի
            int[][] arr = {
                    {6, 5, 9, 7},
                    {6, 7, 1, 4},
                    {2, 2, 4, 3}
            };

            int sum1 = 0;
            int sum2 = 0;

            // 2. Ավելացվեց int i և int j, length()-ը դարձավ length
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    sum1 += arr[i][j];
                }
                sum2 += sum1;
            }

            // 3. Ավելացվեց կետ-ստորակետեր վերջում
            if (sum2 / arr[0].length == sum1) {
                System.out.println("Sums of all the columns numbers are equal");
            }
            else {
                System.out.println("Sums of all the columns numbers are different");
            }
        }
    }

