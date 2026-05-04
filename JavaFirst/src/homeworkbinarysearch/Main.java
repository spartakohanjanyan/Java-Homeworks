package homeworkbinarysearch;

public class Main {
    public static void main(String[] args) {

        double[] arr = {120, 86, 55, 50, 30, 21};

        int index = BinarySearch.search(arr, 50);

        System.out.println(index);
    }
}
