package Array;

import java.util.Scanner;

public class FindingElementGreaterThanThemself {
    static void Brute(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]!=value) {
                    if (arr[j]>value){
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println("Total Element is which is Greater Than Themself is "+cnt);
    }

    public static void Optimal(int[] arr) {

        //Find The Maximum Element In the Array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //Count The Maximum Number Occurance

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                cnt++;
            }
        }

        //Subtract cnt from total Element
        int ans = arr.length-cnt;
        System.out.println("Total Element is: "+ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-3,-2,2,5,6,7,8,10,10,10};
//        Brute(arr);
        Optimal(arr);
    }
}
