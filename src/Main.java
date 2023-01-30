import org.example.queue.ArrayQueue;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // 15> 8+4+2+1 8 > 4+2+1  4 > 2+1  2 > 1

        // 3 , 2 , 1 , 2 ,1 ,3 ,4 , 0, 2 , 6 , 0 , 0
        int[] arr = new int[]{3, 2, 1, 2, 1, 3, 4, 0, 2, 6, 0, 0};

        System.out.println(10 + 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 + 20);

    }

    static String max_min(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : a) {
            if (num < min)
                min = num;

            if (num > max)
                max = num;


        }

        return "max" + max + " " + "min=" + min;
    }

    static int pow(int num, int pow) {
        int result = 1;
        while (pow != 0) {
            pow--;
            result = num * result;

        }
        return result;
    }

    static int char_Times(char c, String str) {
        int count = 0;
        for (char c1 : str.toCharArray()) {
            if (c1 == c)
                count++;

        }
        return count;


    }

    static int isFun(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum = sum + arr[j];
            }
            if ((arr[i] < sum))
                return 0;
        }
        return 1;
    }

    static int isCor(int[] arr) {
        int sum = arr[0] + arr[1] + arr[2];
        for (int i = 3; i < arr.length - 2; i = i + 3) {

            if (!(arr[i] + arr[i + 1] + arr[i + 2] == sum))
                return 0;
            sum = arr[i] + arr[i + 1] + arr[i + 2];
        }
        return 1;
    }


}



