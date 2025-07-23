package WagmiJava.Week5;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/postfix-to-infix-conversion/1
public class PostfixToInfix {
    public static void main(String[] args) {
        String postfix = "ab+c*"; // Example: (a + b) * c
        String infix = postfixToInfix(postfix);
        System.out.println("Infix expression: " + infix);
    }
    static String postfixToInfix(String exp) {
        int i = 0;
        Stack<String> stack = new Stack<>();
        while (i < exp.length()) {
            if ((exp.toCharArray()[i] >= 'A' && exp.toCharArray()[i] <= 'Z')
                    || (exp.toCharArray()[i] >= 'a' && exp.toCharArray()[i] <= 'z')
                    || (exp.toCharArray()[i] >= '0' && exp.toCharArray()[i] <= '9')) {
                stack.push(exp.charAt(i) + "");
            } else {
                String top1 = stack.pop();
                String top2 = stack.pop();
                String temp = '(' + top2 + exp.charAt(i) + top1 + ')';
                stack.push(temp);
            }
            i++;
        }
        return stack.peek();
    }
}
