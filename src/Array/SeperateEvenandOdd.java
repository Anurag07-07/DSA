package Array;

import java.util.Arrays;

public class SeperateEvenandOdd {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,7,9,8,15,20};
        //seperate Even and Odd
        //Two Pointer Approach
        int start = 0,end= arr.length-1;
        while(start<end){
            while(arr[start]%2==0){
                start++;
            }
            while (arr[end]%2!=0){
                end--;
            }
            if (start<end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        System.out.println("Sorted Array is "+ Arrays.toString(arr));
    }
}