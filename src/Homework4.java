import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
    //Առաջին խնդրի լուծում։
        System.out.println("Please enter num in range 1-12: ");
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt()) {
            System.out.println("Please enter only number: ");
            System.exit(1);
        }

        int month = sc.nextInt();

        if(month < 1 || month > 12){
            System.out.println("Please enter num in range 1 - 12: ");
            System.exit(1);
        }

        switch (month){
            case 2 -> System.out.println("28 or 29 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
            default -> System.out.println("31 days");
        }
        //Երկրորդ խնդրի լուծում։
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Please enter num in range 1-12: ");

        if(!sc.hasNextInt()) {
            System.out.println("Please enter only number: ");
            System.exit(1);
        }

        int month1 = sc.nextInt();

        if(month1 < 1 || month1 > 12){
            System.out.println("Please enter num in range 1 - 12: ");
            System.exit(1);
        }

        int days = daysInMonths[month1 - 1];

        if (month1 == 2){
            System.out.println(days + " or 29 days" );
        }else {
            System.out.println(days + " days");
        }

        //երրորդ խնդրի լուծում։

        System.out.println("Please enter your age: ");

        if(!sc.hasNextInt()) {
            System.out.println("Please enter only number: ");
            System.exit(1);
        }

        int age = sc.nextInt();

        System.out.println("Please enter your seating arrangement 1, 2 or 3: ");

        if(!sc.hasNextInt()) {
            System.out.println("Please enter only number: ");
            System.exit(1);
        }


        int category = sc.nextInt();
        int originalPrice = 0 ;

        switch (category) {
            case 1:
                originalPrice = 12000;
                break;
            case 2:
                originalPrice = 8000;
                break;
            case 3:
                originalPrice = 7000;
                break;
            default:
                System.out.println("Please enter num in range 1 - 3: ");
                System.exit(1);
             }
            double finalPrice = originalPrice;

            if (age >= 65) {
                finalPrice = originalPrice * 0.8;
            }

            System.out.println("Customers's age " + age);
            System.out.println("Original price " + originalPrice);

            if (age >= 65){
                System.out.println("Discounted price 20% " + finalPrice);
            } else {
                System.out.println("No discount applied :");
            }

        //Չորրորդ խնդրի լուծում։

        double originalPrice1 = 1000.0;
        double discountPercent = 0;

        System.out.println("Please enter your age: ");
        int age1 = sc.nextInt();

        System.out.println("Please enter number of children: ");
        int childrenCount = sc.nextInt();

        if (age1 < 18 || age1 > 65){
            discountPercent = 20;
        } else {
            switch (childrenCount) {
                case 0: case 1: case 2:
                    discountPercent = 0;
                    break;
                case 3:
                    discountPercent = 15;
                    break;
                case 4:
                    discountPercent = 25;
                    break;
                case 5:
                    discountPercent = 35;
                    break;
                default:
                    discountPercent = 50;
                    break;
            }
        }

        double discountAmount = (originalPrice1 * discountPercent) / 100;
        double finalPrice1 = originalPrice1 - discountAmount;

        System.out.println("Original price " + originalPrice1);

        if (discountPercent > 0) {
            System.out.println("Discount" + discountPercent + " % " + discountAmount);
            System.out.println("Discounted price " + finalPrice1);
        } else {
            System.out.println("No discount applied :");
        }

    }
}