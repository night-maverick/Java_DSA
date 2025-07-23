package WagmiJava.Week1;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Enter you name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Good morning " + name + "!");
    }
}
