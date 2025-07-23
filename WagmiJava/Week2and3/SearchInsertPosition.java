package WagmiJava.Week2and3;
//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = -100;
        System.out.println(searchInsert(nums, target));
    }
    static int searchInsert(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                low++;
            }else{
                high--;
            }
        }
        int i = 0;
        while (i < nums.length){
            if (target <= nums[i]){
                return i;
            }else{
                i++;
            }
        }
        return i;
    }
}
