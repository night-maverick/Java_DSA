package WagmiJava;

import java.util.Scanner;

//Write a program to print whether a number is even or odd. Take input from the user.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 0){
            System.out.println("Neither even nor odd");
        }else if (num % 2 == 0){
            System.out.println(num + " is even");
        }else {
            System.out.println(num + " is odd");
        }
    }
}
