package homeworkbinarysearch;

public class BinarySearch {
    private static void validateArray(double[] arr) {
        for (double num : arr) {
            if (num < 0) {
                throw new IllegalArgumentException("Array contains negative number  ");
            }
        }
    }

    public static int search(double[] arr, double target) {
        validateArray(arr);
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(double[] arr, double target, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }
}
