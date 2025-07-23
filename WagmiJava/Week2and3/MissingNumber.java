package WagmiJava.Week2and3;
//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 5, 6};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums){
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int sum = 0;
        for (int num = 0; num < n; num++) {
            sum = sum + nums[num];
        }

        return expectedSum - sum;
    }
}
