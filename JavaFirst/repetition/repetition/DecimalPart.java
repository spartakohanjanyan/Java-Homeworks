package repetition;

public class DecimalPart {
    public static void main (String[] args) {
        int a = 3;
        int b = 3;
        int c = 4;

        double average = (a + b + c) / 3.0;
        System.out.println(average);

        int abc = a * 100 + b * 10 + c;
        System.out.println(abc);

        double decimalPart = average % 1;
        System.out.println(decimalPart);

    }

}
