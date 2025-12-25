import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Թվի թվանշանները հատ առ հատ։

        System.out.print("Please enter four digit num: ");

        int num = sc.nextInt();

        int thousands = num / 1000;

        int hundreds = (num / 100) % 10;

        int tens = (num / 10) % 10;

        int ones = num % 10;

        System.out.println(thousands + "," + hundreds + "," + tens + "," + ones );


        // Երկրորդ խնդրի լուծում։

        System.out.print("Please enter a: ");
        System.out.print("Please enter b: ");



        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a++;
        int d = b++;

        System.out.println("a = " + a + "," + "b = " + b);
        System.out.println("c = " + c + "," + "d = " + d);

        int e = c--;
        int f = d--;

        System.out.println("c = " + c + "," + "d = " + d);
        System.out.println("e = " + e + "," + "f = " + f);


        //Երրորդ խնդրի լուծում։

        System.out.print("Please enter 9 digit num a1 : ");
        System.out.print("Please enter 2 digit num b1: ");


        int a1 = sc.nextInt(); ;
        int b1 = sc.nextInt();

        long result = (long) a1 * b1;
        System.out.println("Result = " + result);



    }
}