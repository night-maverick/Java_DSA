package WagmiJava.Week6;

public class CountDigits {
    static int count = 1;
    public static int countDigits (int num) {
        if (num/10 == 0) {
            return count;
        }
        count++;
        return countDigits(num/10);
    }

    public static void main(String[] args) {
        int num = 1923846;
        System.out.println(countDigits(num));
    }
}
