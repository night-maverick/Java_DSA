package WagmiJava.Week5;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/prefix-to-postfix-conversion/1
public class PrefixToPostfix {
    public static void main(String[] args) {
        String prefix = "*-A/BC-/AKL";
        String postfix = prefixToPostfix(prefix);
        System.out.println(postfix);
    }
    static String prefixToPostfix(String pre_exp){
        int i = pre_exp.length() -1;
        Stack<String> stack = new Stack<>();
        while (i >= 0){
            if ((pre_exp.toCharArray()[i] >= 'A' && pre_exp.toCharArray()[i] <= 'Z')
                    || (pre_exp.toCharArray()[i] >= 'a' && pre_exp.toCharArray()[i] <= 'z')
                    || (pre_exp.toCharArray()[i] >= '0' && pre_exp.toCharArray()[i] <= '9')) {
                stack.push(pre_exp.charAt(i) + "");
            } else {
                String top1 = stack.pop();
                String top2 = stack.pop();
                String temp = top1 + top2 + pre_exp.charAt(i);
                stack.push(temp);
            }
            i--;
        }
        return stack.peek();
    }
}
