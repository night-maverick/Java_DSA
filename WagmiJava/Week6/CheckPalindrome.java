package WagmiJava.Week6;

public class CheckPalindrome {
    public static boolean isPalindrome (int[] arr, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (arr[i] == arr[j]) {
            i++;
            j--;
        }else{
            return false;
        }
        return isPalindrome(arr, i, j);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        System.out.println(isPalindrome(arr, 0, 4));
    }
}
