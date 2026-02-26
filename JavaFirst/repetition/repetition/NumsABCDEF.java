package repetition;

public class NumsABCDEF {
    public static void main (String[] args) {

        int a = 10;
        int b = 5;
        int c = a;
        int d = b;
        a = a + 1;
        b = b + 1;

        int e = c;
        int f = d;
        c = c - 1;
        d = d - 1;

        System.out.println(a + "," + b + "," + c + "," + d + "," + e + "," + f );
    }
}
