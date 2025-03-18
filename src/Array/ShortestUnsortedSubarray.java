package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestUnsortedSubarray {
    public static void Brute(int[] arr) {

//        Time Complexity  = O(nlogn)

        int[] brr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));
        int start = 0;
        while(arr[start]==brr[start]){
            start++;
        }

        int end = arr.length-1;
        while (arr[end]==brr[end]){
            end--;
        }

        System.out.println(start+" "+end);

    }

    static boolean notInOrder(int[] arr,int i) {
        if (i == 0) {
            return arr[i]>arr[i+1];
        } else if (i== arr.length-1) {
            return arr[i-1]>arr[i];
        }else {
            return arr[i] > arr[i+1] || arr[i]<arr[i-1];
        }
    }

    public static void Optimal(int[] arr) {
        //First Find the Element which are not in order

        //Store The max and min elemment
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (notInOrder(arr,i)) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }

        //Find the index

        int start = 0;
        while(arr[start]<=min){
            start++;
        }

        int end = arr.length-1;
        while(arr[end]>=max){
            end--;
        }

        System.out.println(start+" "+end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,7,10,11,7,12,7,7,16,18,19};
        System.out.println(Arrays.toString(arr));
//        Brute(arr);
        Optimal(arr);
    }
}
