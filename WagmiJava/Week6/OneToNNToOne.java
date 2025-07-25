package WagmiJava.Week6;

public class OneToNNToOne {
    public static void main(String[] args) {
        NToOne(1, 5);
        OneToN(1,5);
    }
    //backtracking
    public static void NToOne(int i, int N) {
        if (i > N) {
            return;
        }
        NToOne(i+1, N);
        System.out.println(i);
    }

    public static void OneToN (int i, int N) {
        if (i > N) {
            return;
        }
        OneToN(i+1, N);
        System.out.println(N-i+1);
    }
}
