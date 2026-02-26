package repetition;

public class NumDigit {
    public static void main(String[] args) {
        int num = 1234;

        int thousands = num / 1000;

        int hundreds = (num / 100) % 10;

        int tens = (num / 10) % 10;

        int ones = num % 10;

        System.out.println(thousands + "," + hundreds + "," + tens + "," + ones);

    }
}
