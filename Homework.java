public class Homework {
    public static void main(String[] args) {

        int a = 4;
        int b = 7;
        int c = 9;
        // 1. Ստանում ենք abc եռանիշ թիվը։
        int abc = a * 100 + b * 10 + c;

        System.out.println("The constructed three-digit number is " + abc);

        // Ստանում ենք թվաբանական միջինը։
        double average = (a + b + c) / 3.0;

        System.out.println("The average value is " + average);

        // Տասնորդական հատվածի առանձնացում։
        double decimalpart = average - (int) average;

        System.out.println("Decimal part of the number is " + decimalpart);

        //2․ Char սիմվոլի արժեքի տպումը։
        char ch = '8';
        int k;

        k = ch - '0';

        System.out.println("The integer value is " + k);

        // Նույնը հատուկ ֆունկցիայի միջոցով։
        char ch1 = '7';
        int g = Character.getNumericValue(ch1);

        System.out.println("The integer value is " + g);

        //3․ Երկու փոփոխականնների գումարի խորանարդի ստացումը։
        int m = 4;
        int n = 7;

        int sum = m + n;
        int result = sum * sum *sum;

        System.out.println("The cub is " + result);

        // Նույնը հատուկ ֆունկցիայի միջոցով։
        double result1 =  Math.pow((m + n), 3);

        System.out.println("The cub is " + (int)result1);




    }
}