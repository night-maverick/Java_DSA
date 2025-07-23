package WagmiJava.Week2and3;

//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class SingleNonDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    static int singleNonDuplicate(int[] nums){
        int[] hash = new int[1000000];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0 && hash[i] != 2){
                return i;
            }
        }
        return -1;
    }
}
