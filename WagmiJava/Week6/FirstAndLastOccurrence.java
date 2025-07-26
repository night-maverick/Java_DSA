package WagmiJava.Week6;

import java.util.Arrays;

public class FirstAndLastOccurrence {
    static int first = -1;
    static int last = -1;
    public static void findOccurrences (int[] arr, int n, int key) {
        if (n < 1) {
            return;
        }
        if (arr[n - 1] == key) {
            if (last == -1) {
                last = n - 1;
            }
            first = n - 1;
        }
        findOccurrences(arr, n - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,2,3};
        int n = 7;
        int key = 3;
        findOccurrences(arr, n, key);
        System.out.println(first + ", " + last);
    }
}
