package JavaPractice;

import java.util.Scanner;

public class StringCall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        changeName(name);
    }
    static void changeName(String name){
        Scanner in = new Scanner(System.in);
        name = in.next();
        System.out.println(name);
    }
}
