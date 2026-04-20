package homeworkstringtoint;

public class StringToInt {
    public static void main(String[] args) {

        String input = "123";

        try {
            int number = Integer.parseInt(input);
            System.out.println("number։ " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error ։ It is not possible to change it to a number ");
        }
    }
}
