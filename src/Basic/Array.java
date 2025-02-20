package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int n = sc.nextInt();

        //Intialize the array
        int[] arr = new int[n];

        //Enter The Value Inside Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter The "+i+" Index Element");
            arr[i] = sc.nextInt();
        }

        //Printing The Array

        //Way 1 (For Loop)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //Way 2 (For each loop)
        for (int x : arr){
            System.out.print(x+" ");
        }

        System.out.println();

        //Way 3 (In Built Function)
        System.out.println(Arrays.toString(arr));
    }
}
