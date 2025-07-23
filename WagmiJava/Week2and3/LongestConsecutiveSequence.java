package WagmiJava.Week2and3;
//https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, -2, 9};
        int k = 15;
        System.out.println(longestSubarray(nums, k));
    }
    //positives and negatives
    static int longestSubarray(int[] nums, int k){
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == k){
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
}
