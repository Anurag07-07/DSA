import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void Brute(int[] arr) {
        int n = arr.length;

        //Use Hashmap to insert Unqique inside That
        //Return the Size of the Hashmap
        //TC = O(nlogn) //Insertion in set take nlogn time
        Set<Integer> unique = new HashSet<>();

        for (int i = 0; i < n; i++) {
            unique.add(arr[i]);
        }

        System.out.println("The Original Size is "+unique.size());
    }

    public static void Optimal(int[] arr) {
        int n = arr.length;
        //Two pointer Approach
        //put two pointer i and j
        //put i on  0th index and iterate j from 1 to n index
        //if j element is same increase the j
        //if j element is not equal to i elemnet insert jth element in front of ith element means arr[i+1] = arr[j]
        //and then increase i and j both

        int i = 0;
        for (int j = 1; j < n;j++) {
            if (arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("The Non Duplicate Elment is: "+(i+1));
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3};
        Brute(arr);
        Optimal(arr);
    }
}
