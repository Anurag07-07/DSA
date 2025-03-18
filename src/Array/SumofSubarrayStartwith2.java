package Array;

import java.util.Scanner;

public class SumofSubarrayStartwith2 {
    public static void Brute(int[] arr) {
        int n = arr.length;

        //7 3 2 -1 6 8 2 5
        //In first  2                One Loop for run the outer loop and one for counting
        //In second 2 -1
        //In third  2 -1 6
        //In four   2 -1 6 8
        //In five   2 -1 6 8 2
        //In six    2 -1 6 8 2 5

        for (int i = 2; i < arr.length; i++) {
            int sum = 0;
            for (int j = 2; j <=i ; j++) {
                sum+=arr[j];
            }
            System.out.println("The Sum is "+sum);
        }
    }

    public static void Better(int[] arr) {

        //Carry Forward Approach

        //Find the sum
        int sum = 0;
        for (int i = 2; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println("The Sum is: "+sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,3,2,-1,6,8,2,5};
//        Brute(arr);
        Better(arr);
    }
}
