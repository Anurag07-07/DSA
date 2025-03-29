package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList2D {
    //Create a function to Read a 2D Arraylist
    public static ArrayList<ArrayList<Integer>> readArrayList() {
        //N Rows
        //M Cols
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr2D = new ArrayList<>(N);

        //For Every Row I have to Create Arraylist
        for (int i = 0; i < N; i++) {
            arr2D.add(new ArrayList<>(M));
            //Add Element
            for (int j = 0; j < M; j++) {
                int no = sc.nextInt();
                arr2D.get(i).add(no);

            }
        }
        return  arr2D;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> arr2D =  new ArrayList<>(5);

        //Create one D arraylist and add to the 2D arraylist
//        ArrayList<Integer> row0 = new ArrayList<>();
//        row0.add(1);
//        row0.add(2);
//        row0.add(3);

        //Create Another Row
//        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//
//        arr2D.add(row0);
//        arr2D.add(row1);
        //Get and Set The Value in 2D Array
//        arr2D.get() to get the particular element at index
//        arr2D.get(1).set(1,6);
            ArrayList<ArrayList<Integer>> arr2D = readArrayList();
//        Iterate Over Array
        for (int i = 0; i < arr2D.size(); i++) {
            for (int j = 0; j < arr2D.get(i).size(); j++) {
                System.out.print(arr2D.get(i).get(j)+" ");
            }
            System.out.println();
        }


    }
}
