package WagmiJava.Week2and3;

import java.util.Arrays;
//https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZeroes(int[] nums){
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        while(k < nums.length){
            nums[k] = 0;
            k++;
        }
    }
}
