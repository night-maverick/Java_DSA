package WagmiJava.Week2and3;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter element to be found: ");
        int num = in.nextInt();
        System.out.println(linearSearch(arr, num));
    }

    static int linearSearch(int[] arr, int num) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
