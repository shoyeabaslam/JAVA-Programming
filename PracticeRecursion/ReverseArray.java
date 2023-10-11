package PracticeRecursion;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int start, int end, int[] arr) {
        if (start > end) {
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(start + 1, end - 1, arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(arr));
        reverse(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }
}
