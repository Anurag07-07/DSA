package Array;

import java.util.Arrays;
import java.util.Scanner;


public class RotateArray {
    public  static void rotate(int[] arr,int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        //Enter The Rotation
        System.out.println("Enter The Rotation");
        int k = sc.nextInt();

        k = k% arr.length;

        rotate(arr,0, arr.length-1);
        rotate(arr,k, arr.length-1);
        rotate(arr,0,k-1);

        System.out.println(Arrays.toString(arr));
    }
}
