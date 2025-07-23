package JavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in. nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        bubbleSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr, int n){
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1 ; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    didSwap = 1;
                }
            }
            if (didSwap == 0){
                break;
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
