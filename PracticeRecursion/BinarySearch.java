package PracticeRecursion;

public class BinarySearch {
    private static boolean binarySearch(int start, int end, int[] arr, int target) {
        if (start > end) {
            return false;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return true;
        }
        if (target > arr[mid]) {
            return binarySearch(mid + 1, end, arr, target);
        } else {
            return binarySearch(start, mid - 1, arr, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 9;
        System.out.println(binarySearch(0, arr.length - 1, arr, target));
    }
}
