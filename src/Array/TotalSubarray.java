package Array;

import java.util.Scanner;

public class TotalSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                cnt++;
            }
            System.out.println();
        }
        System.out.println("Total Subarray "+cnt);
    }
}
