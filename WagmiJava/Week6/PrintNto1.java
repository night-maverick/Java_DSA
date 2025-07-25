package WagmiJava.Week6;

public class PrintNto1 {
    public static void main(String[] args) {
        int N = 10;
        printNto1(N);
    }
    public static void printNto1 (int N) {
        System.out.println(N);
        N--;
        if (N == 0) {
            return;
        }
        printNto1(N);
    }
}
