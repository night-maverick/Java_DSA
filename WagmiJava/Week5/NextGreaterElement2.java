package WagmiJava.Week5;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/next-greater-element-ii/description/
public class NextGreaterElement2 {
    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2*nums.length -1; i >= 0 ; i--) {
            while (!stack.empty() && stack.peek() <= nums[i%nums.length]) {
                stack.pop();
            }
            if (i < nums.length) {
                if (stack.empty()) {
                    ans[i] = -1;
                }else{
                    ans[i] = stack.peek();
                }
            }
            stack.push(nums[i%nums.length]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
