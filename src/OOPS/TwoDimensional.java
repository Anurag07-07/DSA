package OOPS;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> row0 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        arr.add(row0);
        arr.add(row1);

        //Insert Something in array
        arr.get(0).add(12);

        //Print The ArrayList 1
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        //Print The ArrayList 2

        for (int i = 0; i < arr.size(); i++) {
            for(int x: arr.get(i)){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        //Print The ArrayList 3

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

}
