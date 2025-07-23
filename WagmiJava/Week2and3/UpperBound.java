package WagmiJava.Week2and3;
//https://www.codingninjas.com/studio/problems/upper-bound_8165383
public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7};
        int n = arr.length;
        int x = 4;
        System.out.println(upperBound(arr, x, n));
    }
    static int upperBound(int []arr, int x, int n){
        int low = 0;
        int high = n-1;
        while (low < high){
            int mid = low + (high-low)/2;
            if (arr[mid] <= x){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        if (arr[n-1] <= x){
            return n;
        }
        return high;
    }
}
