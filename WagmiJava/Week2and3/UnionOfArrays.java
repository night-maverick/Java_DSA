package WagmiJava.Week2and3;

import java.util.Arrays;

//https://takeuforward.org/plus/dsa/problems/union-of-two-sorted-arrays
public class UnionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 7, 9};
        int[] nums2 = {2, 3, 6, 8, 10};
        System.out.println(Arrays.toString(union(nums1, nums2)));
    }
    static int[] union(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int left = 0;
        int right = 0;
        int[] unionArray = new int[n1 + n2];
        int k = 0;
        while (left < n1 && right < n2){
            if (nums1[left] < nums2[right]){
                unionArray[k] = nums1[left];
                left++;
                k++;
            }else{
                unionArray[k] = nums2[right];
                right++;
                k++;
            }
        }
        while (left < n1){
            unionArray[k] = nums1[left];
            left++;
            k++;
        }
        while (right < n2){
            unionArray[k] = nums1[right];
            right++;
            k++;
        }
        return unionArray;
    }
}
