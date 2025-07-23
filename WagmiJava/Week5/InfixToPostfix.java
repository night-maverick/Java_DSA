package WagmiJava.Week5;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1
public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "(A+B)*C";
        String postfix = infixToPostFix(infix);
        System.out.println(postfix);
    }
    public static String infixToPostFix(String s){
        Stack<Character> stack = new Stack<>();
        String answer = "";
        int i = 0;
        while (i < s.length()) {
            if ((s.toCharArray()[i] >= 'A' && s.toCharArray()[i] <= 'Z')
                    || (s.toCharArray()[i] >= 'a' && s.toCharArray()[i] <= 'z')
                    || (s.toCharArray()[i] >= '0' && s.toCharArray()[i] <= '9')) {
                answer = answer + s.toCharArray()[i];
            } else if (s.toCharArray()[i] == '(') {
                stack.push(s.toCharArray()[i]);
            } else if (s.toCharArray()[i] == ')') {
                while (!stack.empty() && stack.peek() != '(') {
                    answer = answer + stack.peek();
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.empty() && priority(s.toCharArray()[i]) <= priority(stack.peek())) {
                    answer = answer + stack.peek();
                    stack.pop();
                }
                stack.push(s.toCharArray()[i]);
            }
            i++;
        }
        while (!stack.empty()) {
            answer = answer + stack.pop();
        }
        return answer;
    }

    public static int priority(char operator){
        int priority = 0;
        if (operator == '^') {
            priority = 3;
        }else if (operator == '*' || operator == '/') {
            priority = 2;
        }else if (operator == '+' || operator == '-') {
            priority = 1;
        }else{
            priority = -1;
        }
        return priority;
    }
}
