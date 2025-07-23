package WagmiJava.Week1;

import java.util.Scanner;

public class DistanceBetween2Points {
    public static void main(String[] args) {
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter x1:");
            int x1 = in.nextInt();
            System.out.println("Enter y1:");
            int y1 = in.nextInt();
            System.out.println("Enter x2:");
            int x2 = in.nextInt();
            System.out.println("Enter y2:");
            int y2 = in.nextInt();
            int dx = x2 - x1;
            int dy = y2 - y1;
            double dist = Math.sqrt(dx*dx + dy*dy);
            System.out.println(dist);
        }
    }
}
