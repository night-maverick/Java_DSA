package WagmiJava.Week6;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        sum(5, 0);
        System.out.println(sum1(5));
    }
    //functional recursion
    public static int sum1(int N) {
        if (N == 0) {
            return 0;
        }
        return N + sum1(N-1);
    }

    //parametric form
    public static void sum (int N, int sum) {
        if (N == 0) {
            System.out.println(sum);
            return;
        }
        sum(N-1, sum+N);
    }
}
