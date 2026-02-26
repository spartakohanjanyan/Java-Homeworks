package repetition;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {

        System.out.println("Please enter num: ");
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if ((month < 1) || (month > 12)){
            System.out.println("Please enter num from 1 to 12: ");
            System.exit(1);
        }

        switch(month){
            case 4, 6, 9, 11 -> System.out.println("30 days ");
            case 2 -> System.out.println("28 or 29 days ");
            default -> System.out.println("31 days ");
        }




    }
}
