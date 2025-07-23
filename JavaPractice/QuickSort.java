package JavaPractice;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 5, 9, 1, 8};
        quickSort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionindex = partition(arr, low, high);
            quickSort(arr, low, partitionindex - 1);
            quickSort(arr, partitionindex + 1, high);
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j){
            while (arr[i] <= pivot && i < high){
                i++;
            }
            while (arr[j] > pivot && j > low){
                j--;
            }
            if (i < j){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

}
