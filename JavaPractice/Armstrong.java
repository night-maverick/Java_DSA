package JavaPractice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n) {
        int original = n;
        double count = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        double sum = 0;
        temp = n;
        while (temp != 0) {
            double digit = temp % 10;
            sum = sum + (Math.pow(digit, count));
            temp = temp / 10;
        }
        return sum == original;
    }
}
