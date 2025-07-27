package WagmiJava.Week6;

public class ValidParanthesis {
    //brute approach
    public static boolean isValid (String str, int index, int count) {
        if (count < 0) {
            return false;
        }
        if (index == str.length()) {
            return count == 0;
        }
        if (str.charAt(index) == '(') {
            return isValid(str, index + 1, count + 1);
        }
        if (str.charAt(index) == ')') {
            return isValid(str, index + 1, count -1);
        }
        return isValid(str, index +1, count +1)
                || isValid(str, index+1, count -1)
                || isValid(str, index + 1, count);
    }

    public static void main(String[] args) {
        String str = "((())()";
        System.out.println(isValid(str, 0, 0));
        System.out.println(isValidOptimised(str));
    }

    //optimised approach
    public static boolean isValidOptimised (String str) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                min = min + 1;
                max = max + 1;
            } else if (str.charAt(i) == ')') {
                min = min - 1;
                max = max + 1;
            } else {
                min = min - 1;
                max = max + 1;
            }
            if (min < 0) {
                min = 0;
            }
            if (max < 0) {
                return false;
            }
        }
        return min == 0;
    }
}
