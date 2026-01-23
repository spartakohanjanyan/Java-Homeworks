package homework11826;
import java.util.Scanner;

public class DoubleFactorial {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("please enter num: ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }

        System.out.println( result);


    }
}
