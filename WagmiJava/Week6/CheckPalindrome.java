package WagmiJava.Week6;

public class CheckPalindrome {
    public static boolean isPalindrome (int[] arr, int i, int n) {
        if (i >= n/2) {
            return true;
        }
        if (arr[i] == arr[n-1-i]) {
            i++;
        }else{
            return false;
        }
        return isPalindrome(arr, i, n);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        System.out.println(isPalindrome(arr, 0, 5));
    }
}
