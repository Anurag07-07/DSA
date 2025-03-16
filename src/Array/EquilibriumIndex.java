package Array;

import java.util.Scanner;

public class EquilibriumIndex {
    public static void Optimal(int[] arr) {
          //Find Prefix Sum
        int cnt = 0;
        int[] psum = new int[arr.length];
        psum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int left_sum = 0;int right_sum = 0;
            if (i == 0) {
                left_sum = 0;
            }else {
                left_sum = psum[i-1];
            }

            //Find Right Sum
            right_sum = psum[arr.length-1]-psum[i];
            if (right_sum == left_sum) {
                cnt++;
            }

        }
        System.out.println("The Total Equilbrium Index is:"+cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-7,1,5,2,-4,3,0};
        Optimal(arr);
    }
}
