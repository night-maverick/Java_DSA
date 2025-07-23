package WagmiJava.Week2and3;
//https://takeuforward.org/plus/dsa/problems/longest-subarray-with-sum-k
public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 19;
        System.out.println(longestSubarray(nums, k));
    }
    //only positives
    static int longestSubarray(int[] nums, int k){
        int i = 0, j = 0, sum = 0, maxLength = 0;
        while (j < nums.length){
            sum = sum + nums[j];
            while (sum > k && i <= j){
                sum = sum - nums[i];
                i++;
            }
            if (sum == k){
                maxLength = Math.max(maxLength, j - i + 1);
            }
            j++;
        }
        return maxLength;
    }
}
