package homework11826;

public class NumberDigitsAmount {
    public static void main(String[] args){
        int number = 439;
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        int result = number + sum;

        System.out.println("Num = " + number);
        System.out.println("Digits amount = " + sum);
        System.out.println("REsult = " + result);

    }
}
