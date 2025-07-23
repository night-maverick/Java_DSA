package WagmiJava.Week2and3;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0 ; j--) {
                if (nums[i] == target && nums[i] == nums[j]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
