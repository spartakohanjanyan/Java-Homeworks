package homework11826;

public class PalindromeNumber {
    public static void main(String[] args){
        int number = 413934;
        int originalNumber = number;
        int reversedNumberHalf = 0;

        while (originalNumber > reversedNumberHalf) {
            int lastDigit = originalNumber % 10;
            reversedNumberHalf = (reversedNumberHalf * 10) + lastDigit;
            originalNumber = originalNumber / 10;
        }

        if (originalNumber == reversedNumberHalf || originalNumber == reversedNumberHalf / 10) {
            System.out.println(number + " Is palindrome ։");
        } else {
            System.out.println(number + " Isn't palindrome։");
        }

    }
}
