package WagmiJava.Week5;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/prefix-to-infix-conversion/1
public class PrefixToInfix {
    public static void main(String[] args) {
        String prefix = "*-A/BC-/AKL";
        String infix = prefixToInfix(prefix);
        System.out.println(infix);
    }
    static String prefixToInfix(String pre_exp){
            int i = pre_exp.length() - 1;
            Stack<String> stack = new Stack<>();
            while (i >= 0) {
                if ((pre_exp.charAt(i) >= 'A' && pre_exp.charAt(i) <= 'Z')
                        || (pre_exp.charAt(i) >= 'a' && pre_exp.charAt(i) <= 'z')
                        || (pre_exp.charAt(i) >= '0' && pre_exp.charAt(i) <= '9')) {
                    stack.push(pre_exp.charAt(i) + "");
                } else {
                    String top1 = stack.pop();
                    String top2 = stack.pop();
                    String temp = '(' + top1 + pre_exp.charAt(i) + top2 + ')';
                    stack.push(temp);
                }
                i--;
            }
            return stack.peek();
    }
}
