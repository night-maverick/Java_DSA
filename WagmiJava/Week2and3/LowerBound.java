package WagmiJava.Week2and3;
//https://www.naukri.com/code360/problems/lower-bound_8165382
public class LowerBound {
    public static void main(String[] args) {
        //int[] arr = {41, 302, 446, 1205, 1900, 2022, 2450, 2528, 2649, 2915, 3602, 4319, 4365, 5395, 5462, 5883, 7760, 8456 ,9079 ,9198 ,10283 ,10505, 10773 ,11412, 11657 ,11869 ,12462 ,12535, 13272 ,14034, 14462, 14759 ,14944, 15043, 16193, 16392 ,16431, 17367 ,17837 ,18050, 18147, 19214, 19524, 20154, 20486, 20773, 20923, 21946, 21966, 22971, 24623, 24898, 25703, 25847, 25979, 26406, 26835, 26848, 26882, 27319 ,28581, 28786, 28842 ,29410, 30089, 30252, 30287, 30555, 30558, 31666};
        //int x = 23166;
        //int[] arr = {1, 2, 2, 3};
        //int x = 4;
        int[] arr = {2, 4, 6, 7};
        int n = arr.length;
        int x = 4;
        System.out.println(lowerBound(arr, n , x));
    }
    static int lowerBound(int []arr, int n, int x){
        int low = 0;
        int high = n -1;
        while (low < high){
            int mid = (low + high)/2;
            if (arr[mid] < x){
                low = mid + 1;
            }
            if (arr[mid] >= x){
                high = mid;
            }

        }
        return high;
    }
}
