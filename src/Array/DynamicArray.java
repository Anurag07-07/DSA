package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(5);

        //Add Element
        arr.add(5);
        arr.add(10);
        arr.add(2,10);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        //Update Element
        arr.set(2,20);  //2 is Index 20 is Element

        //Get
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));

        //Print Way 1
        for(int x:arr){
            System.out.print(x+" ");
        }

        System.out.println();

        //Print Way 2
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }

        //To Ensure the Minimmum Capacity
        arr.ensureCapacity(100);

        //To Decrese The Capacity
        arr.trimToSize();

        int x = 5;  //Primitive
        //Object Arraylist only understand Object
        Integer y = 5; //This is More PowerFul as its contains behaviour/actions

        arr.add(x);  //Autboxing will happen means  this int x converted into Integer x automatically

        y.toString();

        //Remove The Element
        arr.remove(5);  //This will Remove Element from 5th Index
        arr.remove(Integer.valueOf(5)); //It Delete first occurance of 5

        //This Remove all Occurance of 5
        while (arr.contains(5)){
            arr.remove(5);
        }

        //This is How we take Integer abject
        Integer number = sc.nextInt();

        System.out.println();

        for (Integer i: arr){
            System.out.print(i+" ");
        }
    }
}
