import java.util.Arrays;
import java.util.HashMap;

public class NumberAppearOnce {
    public static void Brute(int[] arr) {
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int value = arr[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j]==value){
                    cnt++;
                }
            }
            if (cnt==1){
                ans = value;
                break;
            }
        }

        System.out.println("The Element Appear Once is: "+ans);
    }

    public static void Better_HASHING(int[] arr) {
        int n = arr.length;
        //Find The Maximum Element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }

        int[] hash = new int[max+1];

        //Iterate Over array and store occurance
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        //Print The Element having Occurance Once in array
        for (int i = 1; i < hash.length; i++) {
            if (hash[i]==1){
                System.out.println("The Once Element is: "+(i));
                break;
            }
        }
    }

    public static void Better_MAP(int[] arr) {
        //In Future Complete it
        int n = arr.length;
        HashMap<Long,Integer> map = new HashMap<>();

        //Iterate over array and store the Occurance of element
        for (int i = 0; i < n; i++) {
        }
    }

    public static void Optimal(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans^arr[i];
        }

        System.out.println("The Once Occurance Element is: "+ans);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
//        Brute(arr);
//        Better_HASHING(arr);
//        Better_MAP(arr);
        Optimal(arr);
    }
}
