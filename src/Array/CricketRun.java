package Array;

import java.util.Scanner;

public class CricketRun {
    public static void Brute(int[] arr){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Query");
        int Q = sc.nextInt();

        for (int i = 1; i <= Q ; i++) {
            System.out.println("Enter The Start Over");
            int L = sc.nextInt();
            System.out.println("Enter The End Over");
            int R = sc.nextInt();
            int sum = 0;
            for (int j = L - 1; j <= R-1; j++) {
                sum+= arr[j];
            }

            System.out.println("The Total Run is  "+sum);
        }
    }

    public static void Better_PrefixSum(int[] arr) {
        Scanner sc =new Scanner(System.in);
        //Find Prefix Sum
        int[] psum = new int[arr.length];
        psum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i-1]+arr[i];
        }

        //Find The Runs
        System.out.println("Enter The Query");
        int Q = sc.nextInt();
        for (int i = 1; i <= Q; i++) {
            System.out.println("Enter Start Over");
            int L = sc.nextInt();
            System.out.println("Enter The End Over");
            int R = sc.nextInt();
            int ans = 0;
            if (L == 0) {
                ans = psum[R];
            }else {
                ans = psum[R]-psum[L-1];
            }

            System.out.println("The Total Runs is "+ans);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] runs = {8,5,3,2,6,20,12,9,4,11};
//        Brute(runs);
        Better_PrefixSum(runs);
    }
}
