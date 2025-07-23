package JavaPractice;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start)/ 2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                start++;
            }else{
                end--;
            }
        }
        return -1;
    }
}
