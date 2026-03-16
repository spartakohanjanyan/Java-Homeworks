package homework22226;

public class StringChar {
    public static void main(String[] args){

        System.out.println(cutString("wahlabi", 'a'));
        System.out.println(cutString("wahlabi", 'a', 'a'));
        System.out.println(cutString("wahlabi", 'u'));
        System.out.println(cutString("wahlabi", 'g', 'b'));
    }

    public static String cutString(String str, char ch) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return str.substring(i);
            }
        }
        return "";
    }

    public static String cutString(String str, char ch1, char ch2) {

        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < str.length(); i++) {

            if (startIndex == -1 && str.charAt(i) == ch1) {
                startIndex = i;
                break;
            }
        }

        for (int i = startIndex + 1; i < str.length(); i++) {
            if (str.charAt(i) == ch2) {
                endIndex = i;
                break;
            }
        }

        if (startIndex == -1 || endIndex == -1 || startIndex > endIndex) {
            return "";
        }

        return str.substring(startIndex, endIndex + 1);
    }
}
