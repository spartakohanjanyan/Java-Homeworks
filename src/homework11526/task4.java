package homework11526;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        int month = 0;
        while (true) {


            System.out.println("Please enter num in range 1-12: ");
            Scanner sc = new Scanner(System.in);

            if (!sc.hasNextInt()) {
                System.out.println("Please enter only number: ");
                sc.next();
                continue;
            }

            month = sc.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Please enter num in range 1 - 12: ");
                continue;
            }
            break;
        }
        switch (month){
            case 2 -> System.out.println("28 or 29 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
            default -> System.out.println("31 days");
        }


    }
}
