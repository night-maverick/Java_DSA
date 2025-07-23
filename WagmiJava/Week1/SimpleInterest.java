package WagmiJava.Week1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = in.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = in.nextDouble();
        System.out.print("Enter the time duration: ");
        double t = in.nextDouble();
        double si = p*r*t/100;
        System.out.println(si);
    }
}
