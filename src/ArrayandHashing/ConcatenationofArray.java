package ArrayandHashing;

import java.util.Arrays;

public class ConcatenationofArray {

    public static void Brute(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2*n];
        int idx = 0;
        for (int i = 1; i <=2 ; i++) {
            for (int num:arr){
                ans[idx++] = num;
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    public static void Better(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2*n];
        int idx = 0;
        for (int i = 0; i <n ; i++) {
            ans[i] = ans[n+i] = arr[i];
        }

        System.out.println(Arrays.toString(ans));
    }



    public static void main(String[] args) {
        int[] arr = {1,2,1};
        Brute(arr);
        Better(arr);
    }
}
