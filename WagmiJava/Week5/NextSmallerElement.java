package WagmiJava.Week5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

//https://takeuforward.org/plus/dsa/problems/next-smaller-element
public class NextSmallerElement {
    public static int[] nextSmallerElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = arr.length -1; i >= 0 ; i--) {
            while (!stack.empty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (!stack.empty()) {
                map.put(arr[i], stack.peek());
            }else{
                map.put(arr[i], -1);
            }
            stack.push(arr[i]);
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        System.out.println(Arrays.toString(nextSmallerElements(arr)));
    }
}
