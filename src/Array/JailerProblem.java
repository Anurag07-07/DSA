package Array;

import java.util.Arrays;
import java.util.Scanner;

public class JailerProblem {
//    Time = O(Nlogn)

    public static int Brute(int[] doors) {
        //Goes on door logic
        for (int round = 1; round <=100 ; round++) {
            for (int door = round-1; door <= 99; door = door+round ) {
                doors[door] = 1-doors[door];
            }
        }

        //Count door with value 1
        int cnt = 0;
        for (int i = 0; i < doors.length; i++) {
            if (doors[i] == 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int Better(int[] doors) {
//      Time  = O(N^1/2)

        int n = doors.length;

        int i = 1;
        int cnt = 0;

        while(i*i<=n) {
            cnt++;
            i++;
        }
        return cnt;
    }

    public static int Optimal(int[] doors) {
        int n = doors.length;
        int ans = 0;
        int start = 0,end = n-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (mid == n/mid) {
                return mid;
            } else if (mid*mid>n) {
                end = mid-1;
            }else {
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] doors = new int[100];


        System.out.println("Total Door Open is "+Brute(doors));
        System.out.println("Total Door Open is "+Better(doors));
        System.out.println("Total Door Open is "+Optimal(doors));
    }
}
