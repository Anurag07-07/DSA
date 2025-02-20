package Basic;

import java.util.Scanner;

public class LinearSearch {

    public static boolean LinearSearch(int[] arr,int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,20,30,40,50};

        System.out.println("Enter The Value to be found");
        int value = sc.nextInt();

        if (LinearSearch(arr,value)){
            System.out.println("Element Found");
        }else {
            System.out.println("Element Not Found");
        }
    }
}
