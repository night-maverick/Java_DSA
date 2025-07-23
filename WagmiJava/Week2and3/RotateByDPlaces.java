package WagmiJava.Week2and3;
//https://www.codingninjas.com/studio/problems/rotate-array_1230543
import java.util.Arrays;

public class RotateByDPlaces {
    public static void main(String[] args) {
        int D = 2;
        int n = 5;
        int[] arr = {5, 76, 34, 12, 45};
        System.out.println(Arrays.toString(rotatebyDplaces(arr, n, D)));
    }
    static int[] rotatebyDplaces(int[] arr, int n, int D){
        for (int i = 1; i <= D ; i++) {
            for (int j = 0; j < n -1 ; j++) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        return arr;
    }
}
