import java.util.Arrays;

public class LeftRotateByDPlaces {
    public static void Brute(int[] arr,int d) {
        int n = arr.length;
        d = d%n;
        //Store the starting first d element in temp arr
        //TC = O(n)
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        //Now Shift the Array Element from d index to n-1 index from start
        //TC= O(d)
        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }

        //Insert The temp array element in the array in after the shifting
        for (int i = n-d; i < n; i++) {
            arr[i] = temp[i-(n-d)];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reversal(int[] arr,int start,int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }

    /*
    * 1 2 3 4 5
    * 3 2 1 4 5 index 0 - 2 (d-1)
    * 3 2 1 5 4 index 3 (d) - 4 (n-1)
    * 4 5 1 2 3 0 - 4 (n-1)
    * 4 5 1 2 3
    *
    *
    * */

    public static void Optimal(int[] arr,int d) {
        int n = arr.length;
        d = d%n;


        reversal(arr,0,d-1);
        reversal(arr,d,n-1);
        reversal(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int  k = 3;
//        Brute(arr,k);
        Optimal(arr,k);
    }
}
