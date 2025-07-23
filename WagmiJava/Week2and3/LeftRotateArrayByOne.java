package WagmiJava.Week2and3;
//https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278
import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2,3, 4,5 };
        int n = arr.length;
        System.out.println(Arrays.toString(rotateArray(arr, n)));
    }
    static int[] rotateArray(int[] arr, int n){

        for (int i = 0; i < n -1 ; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
}
