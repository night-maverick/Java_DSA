package WagmiJava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an operator: ");
        char op = in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/'){
            float ans = 0;
            System.out.println("Enter two numbers: ");
            if (op == '+'){
                float num1 = in.nextFloat();
                float num2 = in.nextFloat();
                ans = num1 + num2;
            }
            if (op == '-'){
                float num1 = in.nextFloat();
                float num2 = in.nextFloat();
                ans = num1 - num2;
            }
            if (op == '*'){
                float num1 = in.nextFloat();
                float num2 = in.nextFloat();
                ans = num1 * num2;
            }
            if (op == '/'){
                float num1 = in.nextFloat();
                float num2 = in.nextFloat();
                if (num2 != 0) {
                    ans = num1 / num2;
                }else{
                    System.out.println("Not defined");
                }
            }
            System.out.println(ans);
        }else{
            System.out.println("Invalid operator");
        }
    }
}
