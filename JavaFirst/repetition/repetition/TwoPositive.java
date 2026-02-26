package repetition;

public class TwoPositive {
    public static void main(String[] args){

        int a = 1;
        int b = -2;
        int c = -2;

        if ((a > 0 && b > 0) || (a > 0 && c > 0) || (b > 0 && c > 0)) {
            System.out.println("Two are positive ");
        }
        else {
            System.out.println("Less than two are positive ");
        }
    }
}
