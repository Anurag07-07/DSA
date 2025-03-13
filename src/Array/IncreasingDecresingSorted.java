package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IncreasingDecresingSorted {
    static void Check(ArrayList<Integer> arr) {
        boolean increasing = true;
        boolean sorted = true;
        if (arr.get(0)> arr.get(1)){
            increasing = false;
        }

        if (increasing) {
            for (int i = 0; i < arr.size()-1; i++) {
                if (arr.get(i) > arr.get(i+1)) {
                    System.out.println("Array is Not Sorted");
                    sorted = false;
                    break;
                }
            }
        }else {
            for (int i = 0; i < arr.size()-1; i++) {
                if (arr.get(i)< arr.get(i+1)) {
                    System.out.println("Array is Not Sorted");
                    sorted = false;
                    break;
                }
            }
        }

        if (increasing && sorted) {
            System.out.println("Array is Increasing and Sorted");
        }
        if (!increasing && sorted) {
            System.out.println("Array is Decreasing and Sorted");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,2,6,8));
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(8,7,6,5));
        Check(arr);
    }
}
