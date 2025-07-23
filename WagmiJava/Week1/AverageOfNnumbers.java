package WagmiJava.Week1;

import java.util.Scanner;

public class AverageOfNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= N){
            sum = sum + i;
            i++;
        }
        float avg = sum/N;
        System.out.println(avg);
    }
}
