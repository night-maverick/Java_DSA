package WagmiJava.Week2and3;
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
public class IsArrayRotated {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2, 1};
        System.out.println(check(nums));
    }
    static boolean check(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i+1)%nums.length]){
                count++;
            }
        }
        if (count<=1){
            return true;
        }
        return false;
    }
}
