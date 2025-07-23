package WagmiJava.Week2and3;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class MinimumInRotatedArray {
    public static void main(String[] args) {
        //int[] nums = {4, 5, 6, 7, 1, 2};
        int[] nums = {2, 1};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums){
        int low = 0;
        int high = nums.length -1;
        int min = Integer.MAX_VALUE;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[low] <= nums[mid]){
                min = Math.min(min, nums[low]);
                low = mid + 1;
            }else if (nums[low]> nums[mid]){
                min = Math.min(min, nums[mid]);
                high = mid -1;
            }
        }
        return min;

    }
}
