package WagmiJava.Week2and3;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
    static int removeDuplicates(int[] nums){
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
