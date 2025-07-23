package WagmiJava.Week2and3;
//https://www.geeksforgeeks.org/dsa/ceiling-in-a-sorted-array/
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        System.out.println(ceilSearch2(arr, 20));
    }
    //linear search approach
    static int ceilSearch1 (int[] arr, int x){
        if (x < arr[0]){
            return 0;
        }
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] < x && arr[i+1] >= x){
                return i+1;
            }
        }
        return -1;
    }
    //binary search approach
    static int ceilSearch2(int[] arr, int x){
        int low = 0;
        int high = arr.length -1;
        while (low < high){
            int mid = low + (high-low)/2;
            if (arr[mid] < x){
                low++;
            }else{
                high--;
            }
        }
        return high;
    }
}
