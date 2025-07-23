package WagmiJava.Week4;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }
    static int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] intersection = new int[list.size()];
        int k = 0;
        while (k < list.size()){
            intersection[k] = list.get(k);
            k++;
        }
        return intersection;
    }
}
