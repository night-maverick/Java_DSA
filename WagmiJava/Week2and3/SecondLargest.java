package WagmiJava.Week2and3;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/ninja-and-the-second-order-elements_6581960
public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {5, 1, 3, 4, 2};
        int n = a.length;
        int[] ans = {secLargest3(a, n), secSmallest(a, n)};
        System.out.println(Arrays.toString(ans));

    }

    //this method to be used for sorted arrays
    static int secLargest2(int[] a, int n) {
        int secondlargest = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[n - 1]) {
                secondlargest = a[i];
                break;
            }
        }
        return secondlargest;
    }

    //better method to be used without sorting
    static int secLargest1(int[] a, int n) {
        int largest = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > secondlargest && a[i] != largest) {
                secondlargest = a[i];
            }
        }
        return secondlargest;
    }

    //optimal method without sorting
    static int secLargest3(int[] a, int n) {
        int largest = a[0];
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                secondlargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > secondlargest) {
                secondlargest = a[i];
            }

        }
        return secondlargest;
    }
    //same method for second smallest
    static int secSmallest(int[] a, int n){
        int smallest = a[0];
        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < smallest){
                secondsmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < secondsmallest){
                secondsmallest = a[i];
            }
        }
        return secondsmallest;
    }
}

