package JavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in. nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        insertionSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr, int n){
        for (int i = 0; i < n -1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j - 1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
