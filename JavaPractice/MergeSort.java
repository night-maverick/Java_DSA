package JavaPractice;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 4, 3, 6, 9};
        mergeSort(arr, 0, arr.length -1 );
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int low, int high){
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftarr[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            rightarr[i] = arr[mid + 1 + i];
        }
        int left = 0;
        int right = 0;
        int k = low;
        while (left < n1 && right < n2){
            if (leftarr[left]<rightarr[right]){
                arr[k] = leftarr[left];
                k++;
                left++;
            }else{
                arr[k] = rightarr[right];
                k++;
                right++;
            }
        }
        while (right < n2){
            arr[k] = rightarr[right];
            k++;
            right++;
        }
        while (left < n1){
            arr[k] = leftarr[left];
            k++;
            left++;
        }


    }
}
