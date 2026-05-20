package homeworkpersoncomparison;

public class Finder {

    public static <T> boolean contains(T[] array, T element) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(element)) {
                return true;
            }
        }

        return false;
    }
}