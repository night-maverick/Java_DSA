package WagmiJava.Week2and3;
//https://leetcode.com/problems/single-number/description/
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,4,1,2};
        System.out.println(singleNumber(arr));
    }
    static int singleNumber(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
