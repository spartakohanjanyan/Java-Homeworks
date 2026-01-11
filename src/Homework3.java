import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Առաջին խնդրի լուծում։
        System.out.println("Please enter age: ");

        int age = sc.nextInt();

        String result = (age >= 18 && age <= 65) ? "Allowed" : "Not allowed";

        System.out.println(result);

        //Երկրորդ խնդրի լուծում։
        System.out.println("Please enter true or false: ");
        System.out.println("Please enter true or false: ");


        boolean hasticket = sc.nextBoolean();
        boolean hasinvitation = sc.nextBoolean();

        String event = (hasticket || hasinvitation) ? "Welcome to event" : "You cannot enter to event";

        System.out.println(event);

        //Երրորդ խնդրի լուծում։
        System.out.println("Please enter int a: ");
        System.out.println("Please enter int b: ");
        System.out.println("Please enter int c: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean positive = (a > 0 && b > 0) || (a > 0 && b > 0) || (b > 0 && c > 0);

        System.out.println(positive ? "Two are positive" : "Less than two are positive");

        //Չորրորդ խնդրի լուծում։
        System.out.println("Please enter int a1: ");
        System.out.println("Please enter int b1: ");


        int a1 = sc.nextInt();
        int b1 = sc.nextInt();

        int result1 = a1 | b1;

        System.out.println(a1 + "," + b1 + "," + result1);

        //Հինգերորդ խնդրի լուծում։
        System.out.println("Please enter int a2 :");
        System.out.println("Please enter int b2 :");

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        if (a2 > b2) {
              System.out.println(a2);
        }else if (b2 > a2) {
              System.out.println(b2);
        }else {
              System.out.println("Equal");
        }


        //Վեցերորդ խնդրի լուծում։
        System.out.println("Please enter the student score (0-100)");

        int score = sc.nextInt();


        if (score >= 90 && score <= 100) {
            System.out.println("Excellent");
        } else if (score >= 70 && score < 90) {
            System.out.println("Good");
        } else if (score >= 50 && score < 70) {
            System.out.println("Average");
        } else if (score >= 0 && score < 50) {
            System.out.println("Fail");
        }

        //*Յոթերորդ խնդրի լուծում։
        System.out.println("Please enter int bool1: ");
        System.out.println("Please enter int bool2: ");

        int bool1 = sc.nextInt();
        int bool2 = sc.nextInt();

        int xor = bool1 ^ bool2;

        String resultxor = (xor == 1) ? "Different" : "Same";

        System.out.println("Value is: " + resultxor);


        //Ութերորդ խնդրի լուծում։
        System.out.println("Please enter num: ");

        int num = sc.nextInt();

        String result2 = ((num & 1) == 0) ? "Even" : "Odd";

        System.out.println("Num is: " + result2);
    }
}
