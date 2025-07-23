package WagmiJava.Week5;

import java.util.Stack;

//https://takeuforward.org/plus/dsa/problems/infix-to-prefix-conversion
public class InfixToPrefix {
    public static void main(String[] args) {
        String infix = "(A+B)*C";
        String prefix = infixToPrefix(infix);
        System.out.println(prefix);
    }
    public static String infixToPrefix(String s) {
        s = reverse(s);
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
                while (!stack.isEmpty() && stack.peek() != '(') {
                    answer = answer + stack.peek();
                    stack.pop();
                }
                stack.pop();
            } else {
                if (s.toCharArray()[i] == '^') {
                    while (!stack.isEmpty() && priority(s.toCharArray()[i]) <= priority(stack.peek())) {
                        answer = answer + stack.peek();
                        stack.pop();
                    }
                } else {
                    while (!stack.isEmpty() && priority(s.toCharArray()[i]) < priority(stack.peek())) {
                        answer = answer + stack.peek();
                        stack.pop();
                    }
                }
                stack.push(s.toCharArray()[i]);
            }
            i++;
        }
        while (!stack.isEmpty()) {
            answer = answer + stack.pop();
        }
        answer = reverse(answer);
        return answer;
    }

    public static String reverse(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.toCharArray()[i] == '(') {
                reverse = reverse + ')';
            }else if (s.toCharArray()[i] == ')') {
                reverse = reverse + '(';
            } else {
                reverse = reverse + s.toCharArray()[i];
            }
        }
        return reverse;
    }

    public static int priority(char operator) {
        int priority = 0;
        if (operator == '^') {
            priority = 3;
        } else if (operator == '*' || operator == '/') {
            priority = 2;
        } else if (operator == '+' || operator == '-') {
            priority = 1;
        } else {
            priority = -1;
        }
        return priority;
    }
}
