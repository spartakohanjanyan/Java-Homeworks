package repetition;
import java.util.Scanner;
public class ArrMonthDays {
    public static void main(String[] args){

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("please enter num from 1 to 12: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        int days = daysInMonth[month - 1];

        System.out.println(days);


    }
}
