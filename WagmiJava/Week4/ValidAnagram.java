package WagmiJava.Week4;

//https://leetcode.com/problems/valid-anagram/description/
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagarat";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t){
        int[] hash1 = new int[26];
        for (char letter : s.toCharArray()){
            hash1[letter - 'a']++;
        }
        int[] hash2 = new int[26];
        for (char letter : t.toCharArray()){
            hash2[letter - 'a']++;
        }
        int i = 0;
        while (i < 26){
            if (hash1[i] != hash2[i]){
                return false;
            }
            if (hash1[i] == hash2[i]){
                i++;
            }
        }
        return true;
    }
}
