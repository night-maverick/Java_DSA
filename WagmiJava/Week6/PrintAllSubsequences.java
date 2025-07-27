package WagmiJava.Week6;

import java.util.ArrayList;

public class PrintAllSubsequences {
    static ArrayList<Character> list = new ArrayList<>();
    public static void allSubsequences (String str, int index, ArrayList<Character> sequence) {
        if (index >= str.length()) {
            System.out.println(sequence.toString());
            return;
        }
        sequence.add(str.charAt(index));
        allSubsequences(str, index+1, sequence);
        sequence.removeLast();
        allSubsequences(str, index+1, sequence);
    }

    public static void main(String[] args) {
        String str = "beam";
        allSubsequences(str, 0, list);
    }
}
