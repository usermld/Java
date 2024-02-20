package SEMINAR;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 3, 6, 4, 543, 45, 54, 23, 32, 3, 3, 3, 3, 54, 5, 5, 5, 5, 5, 6, 66, 6 };
        int value = 3;
        ReplaceArr(arr, value);
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == value) {

        // }
        // }
        System.out.println(Arrays.toString(arr));
    }

    private static void ReplaceArr(int[] arr, int value) {
        int right = arr.length - 1;
        int left = 0;

        while (arr[right] == value) {
            right--;
        }
        while (left < right) {
            if (arr[left] == value) {
                arr[left] = arr[right];
                arr[right] = value;
                right--;
            }
            left++;
        }
    }
}
