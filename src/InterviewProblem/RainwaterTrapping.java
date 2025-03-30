package InterviewProblem;

import java.util.Arrays;
import java.util.Scanner;

public class RainwaterTrapping {
    public static void Brute(int[] arr) {

        //First Run the Outer Loop
        int n = arr.length;
        int water = 0;
        //We Consider  from i = 1 to i = n-2 because last building can't the Word
        for (int i = 1; i < n-1 ; i++) {

            //Find Max on left Side
            int left = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] > left) {
                    left = arr[j];
                }
            }

            //Find Max on Right Side
            int right = Integer.MIN_VALUE;
            for (int j = i; j < n ; j++) {
                if (arr[j] > right) {
                    right = arr[j];
                }
            }

            //Comparing and Add Them
            water+=Math.min(left,right)-arr[i];
        }

        System.out.println("The Total Water is: "+water);
    }

    public static void Better(int[] arr) {
        int n = arr.length;
        int water = 0;
        //Create the prefix Sum with max sum till that index
        int[] psum = new int[n];
        psum[0] = arr[0];
        for (int i = 1; i < n; i++) {
           psum[i] = Math.max(psum[i-1],arr[i]);
        }

        //Create a Suffix Sum with max sum till that index
        int[] ssum = new int[n];
        ssum[n-1] = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            ssum[i] = Math.max(ssum[i+1],arr[i] );
        }

        for (int i = 0; i < n; i++) {
            int left = psum[i];
            int right = ssum[i];
            water+= Math.min(left,right)-arr[i];
        }

        System.out.println("The Water Trapped is: "+water);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,0,4,2,5,0,6,4,0,5};
//        Brute(arr);
        Better(arr);
    }
}
