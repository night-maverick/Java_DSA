package WagmiJava.Week6;

public class PrintSomethingNTimes {
    public static void main(String[] args) {
        int N = 1;
        printNTimes(N);
    }
    public static void printNTimes(int N) {
        System.out.println("I am learning Java.");
        N--;
        if (N == 0) {
            return;
        }
        printNTimes(N);
    }
}
