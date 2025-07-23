package WagmiJava.Week4;
//https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfIdenticalPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums){
        int[] hash = new int[101];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        int pairs =0;
        int pair = 0;
        for (int i = 0; i < 101; i++) {
            if (hash[i]>1){
                pair = hash[i]*(hash[i] -1)/2;
                pairs = pairs + pair;
            }
        }
        return pairs;
    }
}
