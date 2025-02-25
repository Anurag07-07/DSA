package Array;

import java.util.Arrays;

public class Waveform {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // Logic
        for (int cols = 0; cols < arr[0].length; cols++) {

            if (cols%2 == 0) {
                for (int rows = 0; rows < arr.length; rows++) {
                    System.out.println(arr[rows][cols]);
                }
            }else {
                for (int rows = arr.length-1; rows >=0 ; rows--) {
                    System.out.println(arr[rows][cols]);
                }
            }

        }
    }
}
