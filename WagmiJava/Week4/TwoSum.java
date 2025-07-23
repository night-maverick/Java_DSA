package WagmiJava.Week4;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum1(nums, target)));
    }
    //brute approach
    static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //optimised approach
    static int[] twoSum1(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }
        }
        return new int[]{};
    }
}
