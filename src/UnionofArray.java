import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionofArray {

    public static void Brute(int[] arr,int[] brr) {
        //Create a set and and iterate over both array and store all Unique Element in the array
        int n1 = arr.length;
        int n2 = brr.length;

        Set<Integer> union = new HashSet<>();
        //TC = O(nlogn)
        for (int i = 0; i < n1; i++) {
            union.add(arr[i]);
        }

        //TC = O(nlogn)
        for (int i = 0; i < n2; i++) {
            union.add(brr[i]);
        }

        System.out.println(union);
    }

    public static void Optimal(int[] arr,int[] brr) {
        int n1 = arr.length;
        int n2 = brr.length;

        ArrayList<Integer> union = new ArrayList<>();

        //Two Pointer Approach  TC = O(n1+n2)
        int i = 0;
        int j = 0;

        while (i<n1 && j<n2){
            if (arr[i]<=brr[j]){
                if (union.size() == 0 || !union.contains(arr[i])){
                    union.add(arr[i]);
                }
                i++;
            }else {
                if (union.size() == 0 || !union.contains(brr[j])){
                    union.add(brr[j]);
                }
                j++;
            }
        }

        while(i<n1){
            if (union.size() == 0 || !union.contains(arr[i])){
                union.add(arr[i]);
            }
            i++;
        }

        while(j<n2){
            if (union.size() == 0 || !union.contains(brr[j])){
                union.add(brr[j]);
            }
            j++;
        }

        System.out.println(union);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        int[] brr = {2,3,4,4,5,6};
//        Brute(arr,brr);
        Optimal(arr,brr);
    }
}
