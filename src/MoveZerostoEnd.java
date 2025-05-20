import java.util.Arrays;

public class MoveZerostoEnd {

    public static void Brute(int[] arr) {
        int n = arr.length;
        //Iterate over an array and insert all non zero element in temp array
        //TC = O(n)
        int[] temp = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        //Now store all non zero element in the original array
        //TC = O(n-no of zeroes)
        int i = 0;
        int cnt = 0;
        while (temp[i]!=0){
            arr[i] = temp[i];
            i++;
            cnt++;
        }

        //Now Fill all the Left Spaces with zero
        //TC = O(n-no of non-zeroes)
        for (int k = cnt; k < n; k++) {
            arr[k] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Optimal(int[] arr) {
        int n = arr.length;

        //First The First Zeroes
        //TC =O(n)
        int i = -1;
        for (int j = 0; j < n; j++) {
            if (arr[j]==0){
                i = j;
                break;
            }
        }

        //Use Two Pointer Approach
        //TC = O(n)
        for (int j = i+1; j < n;j++) {
            if (arr[j]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
//        Brute(arr);
        Optimal(arr);
    }
}
