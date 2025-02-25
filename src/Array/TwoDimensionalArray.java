package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {

    public static void PrintArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void jaggedArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of rows");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];

        //Create The The Colums
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter "+(i+1)+" cols");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            //take input data
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        PrintArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        //Way 1
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        //Way 2
        //Loop to iterate over 2d Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Way 3
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        */
        jaggedArray();
    }
}
