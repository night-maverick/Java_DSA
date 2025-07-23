package WagmiJava.Week5;

import java.util.Stack;
//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
public class ParanthesesChecker {
    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == '(' || s.toCharArray()[i] == '{' || s.toCharArray()[i] == '['){
                stack.push(s.toCharArray()[i]);
            }else{
                if (stack.empty()){
                    return false;
                }
                char bracket = stack.pop();
                if (s.toCharArray()[i] == ')' && bracket == '('
                    || s.toCharArray()[i] == '}' && bracket == '{'
                || s.toCharArray()[i] == ']' && bracket == '['){

                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
