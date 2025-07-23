package WagmiJava.Week2and3;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,7,0,1};
        int target = 10;
        System.out.println(search(nums, target));
    }
    static int max(int[] nums){
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max]){
                max = i;
            }
        }
        return max;
    }
    static int binarSearch(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target == nums[mid]){
                return mid;
            }else if (target > nums[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    static int search(int[] nums, int target){
        int pivotIndex = max(nums);
        if (target == nums[pivotIndex]){
            return pivotIndex;
        }else if (target >= nums[0]){
            return binarSearch(nums, target, 0, pivotIndex-1);
        }else{
            return binarSearch(nums, target, pivotIndex+1, nums.length-1 );
        }
    }
}
