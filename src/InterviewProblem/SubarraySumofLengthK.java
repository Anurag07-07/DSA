package InterviewProblem;

import java.util.Scanner;

/*
   k = 3
   0 1  2 3 4  5 6 7  8 9
* -3,4,-2,5,3,-2,8,2,-1,4
* [0..2]
* [1..3]
* .
* .
* .
* [i,k-1+i]
*
* */

public class SubarraySumofLengthK {
    public static void Brute(int[] arr,int k) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n-k; i++) {
            int j = k-1+i;
            int sum = 0;
            for (int l = i; l <= j; l++) {
                sum+=arr[l];
            }
            if (largest < sum) {
                largest = sum;
            }
        }

        System.out.println("The Largest Sum: "+largest);

    }

    /*
    * 0 1  2 3 4  5 6 7  8 9
   * -3,4,-2,5,3,-2,8,2,-1,4
    *-3 1 -1 4 7  5 13 15 14 18
    *
    *
    *
    *
    *
    * */

    public static void Better_PrefixSum(int[] arr,int k) {
        int n = arr.length;
        int[] psum = new int[n];

        psum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i-1]+arr[i];
        }

        //Run a Loop for finding max subarray
        //Note: most subarray has prefix sumlogic
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n-k; i++) {
            int j = k-1+i;
            int sum = 0;
            if (i == 0) {
                 sum = psum[j];
            }else {
                 sum = psum[j] - psum[i - 1];
            }

            if (largest < sum) {
                largest = sum;
            }
        }
        System.out.println("The Max Sum is: "+largest);
    }

    //Optimal Sliding Window
    public static void Optimal_SlidingWindow(int[] arr,int k) {
        int n = arr.length;
        //First Find The One Subarray Sum
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+= arr[i];
        }

        int ans = sum;

        //Apply Sliding Window
        for (int i = 1; i < n-k; i++) {
            sum+=arr[k-1+i]-arr[i-1];
            sum = Math.max(sum,ans);
        }

        System.out.println("The Maximum Sum is: "+sum);
    }

    public static void main(String[] args) {
        int[] arr = {-3,4,-2,5,3,-2,8,2,-1,4};
//        Brute(arr,3);
//        Better_PrefixSum(arr,3);
        Optimal_SlidingWindow(arr,3);
    }
}
