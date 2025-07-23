package WagmiJava.Week1;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of products: ");
        int products = in.nextInt();
        double finalPrice = 0;
        for (int i = 1; i <= products; i++) {
            System.out.print("Enter the price of product " + i + ": ");
            double price = in.nextDouble();
            System.out.print("Enter the discount as perecentage: ");
            double discount = in.nextDouble();

            finalPrice = finalPrice + price - (discount*price)/100;
        }
        System.out.println(finalPrice);
    }
}
