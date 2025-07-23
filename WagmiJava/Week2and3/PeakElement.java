package WagmiJava.Week2and3;
//https://leetcode.com/problems/find-peak-element/description/
public class PeakElement {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums2));
    }
    static int findPeakElement(int[] nums){
        if (nums.length == 1){
            return 0;
        }else if (nums[0] > nums[1]){
            return 0;
        }else if (nums[nums.length-1] > nums[nums.length-2]){
            return nums.length-1;
        }
        int low = 1;
        int high = nums.length - 2;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid;
            }else if (nums[mid] > nums[mid+1]){
                high = mid -1;
            }else if (nums[mid] > nums[mid-1]){
                low = mid + 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
