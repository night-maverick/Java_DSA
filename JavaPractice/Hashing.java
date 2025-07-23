package JavaPractice;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        int q = in.nextInt();
        while (q>0){
            int number = in.nextInt();
            System.out.println(hash[number]);
            q--;
        }
    }
}
