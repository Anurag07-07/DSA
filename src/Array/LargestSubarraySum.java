package Array;

import java.util.Scanner;

public class LargestSubarraySum {
    static void Brute(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                //Calculate Largest Sum
                int sum = 0;
                for (int k = i; k <=j ; k++) {
                    sum += arr[k];
                }
                if (sum > largest) {
                    largest = sum;
                }
            }
        }
        System.out.println("The Largest Sum is "+largest);
    }

    public static void Better_PrefixSum(int[] arr){
        //Prefix Sum
        int[] psum = new int[arr.length];
        psum[0] = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            psum[i] = psum[i-1]+arr[i];
        }

        //Find The Largest
        int largest_number = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                //find Sum
                int sum = 0;
                if (i == 0) {
                    sum = psum[j];
                }else {
                    sum = psum[j]-psum[i-1];
                }
                if (sum >largest_number) {
                    largest_number = sum;
                }
            }
        }
        System.out.println("The Largest Sum "+largest_number);
    }

    public static void Optimal_KadaneALgorithm(int[] arr) {
        int largest_sum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
            if (sum > largest_sum) {
                largest_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("The Largest Sum "+largest_sum);
    }
    public static void main(String[] args) {
        int [] arr = {5,-3,2,-7,6,5,8,-4,11,-10,-15};
//        Brute(arr);
//        Better_PrefixSum(arr);
        Optimal_KadaneALgorithm(arr);
    }
}
