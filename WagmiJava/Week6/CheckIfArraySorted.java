package WagmiJava.Week6;

public class CheckIfArraySorted {
    public static boolean isSorted (int[] arr, int n) {
        if (n == 1) {
            return true;
        }
        if (arr[n-1] < arr[n-2]) {
            return false;
        }
        return isSorted(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,6};
        int n = 6;
        System.out.println(isSorted(arr, n));
    }
}
