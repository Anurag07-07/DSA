package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void Brute(int[] arr,int target) {

        //Using For Loop

        int N = arr.length;
        for (int i = 0; i <=N-2 ; i++) {
            for (int j = i+1; j <=N-1 ; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }

    public static void Better(int[] arr,int target) {

        //Two Pointer With Sorting

        int N = arr.length;
        int start = 0,end = N-1;
        while (start<end){
            int sum = arr[start]+arr[end];
            if (sum == target) {
                System.out.println(start+" "+end);
                start++;end--;
            } else if (sum<target) {
                start++;
            }else {
                end--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,8,10,13,11};
        Arrays.sort(arr);
        int target = 15;
        Brute(arr,target);
        Better(arr,target);
    }
}
