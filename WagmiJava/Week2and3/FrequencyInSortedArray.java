package WagmiJava;
//https://www.geeksforgeeks.org/dsa/count-number-of-occurrences-or-frequency-in-a-sorted-array/
public class FrequencyInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 4;
        System.out.println(occurences(arr, target));
    }
    static int occurences(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
