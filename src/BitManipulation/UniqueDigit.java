package BitManipulation;

import java.util.Scanner;

public class UniqueDigit {
    public static void main(String[] args) {
        int[] arr = {5,6,2,6,2,7,5};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans^arr[i];
        }

        System.out.println("The Unique Number is: "+ans);
    }
}
