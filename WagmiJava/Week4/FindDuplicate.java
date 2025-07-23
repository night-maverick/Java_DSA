package WagmiJava.Week4;
//https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,3};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums){
        int[] hash = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (hash[i] > 1){
                return i;
            }
        }
        return -1;
    }
}
