package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    static boolean Search(ArrayList<Integer> arr,int target ) {
        int start = 0,end = arr.size();
        while (start<end){
            int mid = start+(end-start)/2;
            if (arr.get(mid)==target){
                return true;
            } else if (arr.get(mid)>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create an array
        ArrayList<Integer> arr = new ArrayList<>(6);
        for (int i = 0; i < 7; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Enter The Searching Value...");
        int target = sc.nextInt();

        if (Search(arr,target)){
            System.out.println("Value is Founded");
        }else {
            System.out.println("Value is Not Founded");
        }
    }
}
