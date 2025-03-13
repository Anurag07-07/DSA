package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortedOrNot {
     static boolean Check(ArrayList<Integer> arr) {
         for (int i = 0; i < arr.size()-1; i++) {
             if (arr.get(i) > arr.get(i+1)) {
                 return false;
             }
         }
         return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,7,12,15,20,25));
        if (Check(arr)) {
            System.out.println("Array is Sorted");
        }else {
            System.out.println("Array is Not Sorted");
        }
    }
}
