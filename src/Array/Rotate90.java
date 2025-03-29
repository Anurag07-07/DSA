package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate90 {

    public  static void reverse(int[] arr){
        int start = 0,end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Rows");
        int rows = sc.nextInt();
        System.out.println("Enter The Cols");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //First find Transpose
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Find Reverse of each Row
        for (int i = 0; i < rows; i++) {
            reverse(arr[i]);
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
