package WagmiJava.Week6;

public class SumOfArrayElements {

    static int sum = 0;
    public static void sum (int[] arr, int n) {
        if (n < 1) {
            return;
        }
        sum = sum + arr[n -1];
        sum(arr, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {11,45,32,78,54};
        sum(arr, 5);
        System.out.println(sum);
    }
}
