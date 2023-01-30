package problems;

import java.util.Arrays;

public class ReverseAnArray {
    int[] arr = new int[]{1, 2, 3, 4, 5};
    //  reverse -> log(n)
    static void reverse(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}