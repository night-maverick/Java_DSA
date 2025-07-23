package WagmiJava.Week5;

import java.util.Stack;

//https://leetcode.com/problems/min-stack/description/
public class MinStack {
    public class Minstack{
        public Minstack() {
            MinStack obj = new MinStack();
        }
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        public void push(int val) {
            stack.push(val);
            if (minStack.empty() || val <= minStack.peek()){
                minStack.push(val);
            }
        }

        public void pop() {
            int temp = stack.peek();
            stack.pop();
            if (temp == minStack.peek()){
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
