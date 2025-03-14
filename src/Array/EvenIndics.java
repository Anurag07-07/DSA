package Array;

import java.util.Arrays;

public class EvenIndics {
    public static void EvenPrefixSum(int[] arr) {
        int[] psum = new int[arr.length];
        psum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i %2 == 0) {
                psum[i] = psum[i-1]+arr[i];
            }else{
                psum[i] = psum[i-1];
            }
        }

        System.out.println(Arrays.toString(psum));
    }
    public static void main(String[] args) {
        int[] arr = {3,-2,4,6,-3,5};
        EvenPrefixSum(arr);
    }
}
