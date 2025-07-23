package WagmiJava.Week4;

import java.util.HashSet;

//https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {1,3,4,34,23,7,8,6,24,25,9,27,26,10, 11};
        System.out.println(longestConsecutive(nums));
    }
    static int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int length = 0;
        for (int num: set){
            if (!set.contains(num - 1)) {
                int start = num;
                int count = 1;
                while (set.contains(start + 1)){
                    start++;
                    count++;
                }
                length = Math.max(count, length);
            }
        }
        return length;
    }
}
