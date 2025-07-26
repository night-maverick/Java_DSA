package WagmiJava.Week6;

public class Power {
    //brute
    public static int power (int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n-1);
    }
    //optimised
    public static int powerOptimised (int x, int n) {
        if (n == 0) {
            return 1;
        }
        int half = powerOptimised(x, n/2);
        if (n % 2 == 0) {
            return half * half;
        }
        return x * half * half;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(power(x, n));
        System.out.println(powerOptimised(x, n));
    }
}
