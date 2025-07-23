package WagmiJava.Week5;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/postfix-to-prefix-conversion/1
public class PostfixToPrefix {
    public static void main(String[] args) {
        String postfix = "ABC/-AK/L-*";
        String prefix = postfixToPrefix(postfix);
        System.out.println(prefix);
    }
    static String postfixToPrefix(String post_exp){
        int i = 0;
        Stack<String> stack = new Stack<>();
        while (i < post_exp.length()){
            if ((post_exp.toCharArray()[i] >= 'A' && post_exp.toCharArray()[i] <= 'Z')
                    || (post_exp.toCharArray()[i] >= 'a' && post_exp.toCharArray()[i] <= 'z')
                    || (post_exp.toCharArray()[i] >= '0' && post_exp.toCharArray()[i] <= '9')) {
                stack.push(post_exp.charAt(i) + "");
            } else {
                String top1 = stack.pop();
                String top2 = stack.pop();
                String temp = post_exp.charAt(i) + top2 + top1;
                stack.push(temp);
            }
            i++;
        }
        return stack.peek();
    }
}
