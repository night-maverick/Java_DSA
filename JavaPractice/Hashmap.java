package JavaPractice;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int q = in.nextInt();
        while (q>0){
            int number = in.nextInt();
            System.out.println(map.get(number));
            q--;
        }

    }
}
