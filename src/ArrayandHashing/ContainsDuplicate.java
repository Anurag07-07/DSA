package ArrayandHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean Brute_TWOLOOP(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Better_SORTING(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i-1]) {
                return true;
            }
        }

        return false;
    }

    public static boolean Optimal_HASHSET(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int num :arr){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};

        if (Optimal_HASHSET(arr)) {
            System.out.println("Contains Duplicate");
        }else {
            System.out.println("Not Contains Duplicate");
        }
    }
}
