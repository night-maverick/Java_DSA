package WagmiJava.Week6;

public class Factorial {
    static int factorial = 1;
    public static int factorial (int n) {
        if (n < 1) {
            return factorial;
        }
        factorial = n*factorial;
        return factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
