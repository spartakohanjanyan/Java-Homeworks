package homework11826;

public class task4 {
    public static void main(String[] args){
        int number = 43934;
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number = number / 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " Is palindrome ։");
        } else {
            System.out.println(originalNumber + " Isn't palindrome։");
        }

    }
}
