package Array;

import java.util.Arrays;
import java.util.Scanner;

/*
   0  1  2  3  4
* 10 20 30 40 50
pos = 2  ele = 60
pos = 2 means index = 1

so we have to run the loop from N-1 to pos-1
and perform this operation
arr[i+1] = arr[i]
* */


public class InsertTheElement {

    static int[] InsertElement(int N,int[] arr,int position,int element) {
        for (int i = N-1; i >= position-1 ; i--) {
            arr[i+1] = arr[i];
        }

        System.out.println("Insert The Element");
        arr[position-1] = element;

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int N = sc.nextInt();
        int[] arr = new int[N+1];

        System.out.println("Enter The Element");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter The Postion");
        int position = sc.nextInt();
        System.out.println("Enter the Element");
        int Element = sc.nextInt();

        int[] ans = InsertElement(N,arr,position,Element);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
