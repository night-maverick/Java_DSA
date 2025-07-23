package WagmiJava.Week2and3;
//https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    static int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
                if (count > max) {
                    max = count;
                }
            }
            if (nums[i] == 0){
                count = 0;
            }
        }
        return max;
    }
}
