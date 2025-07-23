package WagmiJava.Week4;

import java.util.ArrayList;
import java.util.HashMap;

//https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"beat", "seat", "teab", "east", "tall", "sleep", "leeps"};
        System.out.println(groupAnagrams(strs));
    }
    static ArrayList<ArrayList<String>> groupAnagrams(String[] strs){
        HashMap<String, ArrayList> map = new HashMap<>();
        for (String word : strs){
            int[] hash = new int[26];
            for (char letter : word.toCharArray()){
                hash[letter - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i : hash){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            if (!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(word);
        }
        return new ArrayList(map.values());
    }
}
