package Array;

import java.util.Scanner;

/*
* pos = 1
*  1  2  3  4  5  pos
*  0  1  2  3  4  index
* 10 20 30 40 50
* pos 1 means index 0
* so what we do is
* start a loop from i = pos run the loop till n-1
* and we perform the operation
* arr[i-1] = arr[i]
* that i!=0
* */

public class DeleteTheElement {
    static int[] RemoveElement(int[] arr,int position) {
        for (int i = position; i < arr.length ; i++) {
            if (i!=0) {
                arr[i-1] = arr[i];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter The Element");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter The Postion");
        int position = sc.nextInt();

        int[] ans = RemoveElement(arr,position);

        for (int i = 0; i < ans.length-1; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
