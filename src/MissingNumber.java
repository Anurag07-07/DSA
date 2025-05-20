import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {
    public static void Brute(int[] arr) {
        int n = arr.length;
        int ans = n;
        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (int j = 0; j < n-1; j++) {
                if (arr[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (flag == false){
                ans = i;
                break;
            }
        }

            System.out.println("The Missing Element is "+ans);
    }

    public static void Better(int[] arr) {
        int n = arr.length;
        int ans = n;
        //Create a hash Array of n+2 size
        int[] hash = new int[n+2];

        //Iterate over an array
        //Put the occurance of element in inside hash array
        for (int i = 0; i < n; i++) {
            hash[arr[i]] = 1;
        }


        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                ans = i;
                break;
            }
        }

        System.out.println("The Missing Element is "+ans);

    }

    public static void Optimal_ADD(int[] arr) {
        int n = arr.length+1;
        //Find The Sum of n terms;
        int sum_1 = (n*(n+1))/2;

        //Find the Sum of all The Element in the array
        int sum_2 = 0;
        for (int i = 0; i < n-1; i++) {
            sum_2 += arr[i];
        }

        System.out.println("The Missing Element is: "+(sum_1-sum_2));
    }

    public static void Optimal_XOR(int[] arr) {
        int n = arr.length+1;

//        XOR Way1
//        int XOR1 = 0;
//        for (int i = 1; i <= n; i++) {
//            XOR1 = XOR1^i;
//        }
//
//        int XOR2 = 0;
//        for (int i = 0; i < n-1; i++) {
//            XOR2 = XOR2^arr[i];
//        }
//
//        System.out.println("The Missing Element is: "+(XOR1^XOR2));


        //XOR Way2
        int XOR2 = 0;
        int XOR1 = 0;
        for (int i = 0; i < n-1; i++) {
            XOR2 = XOR2^arr[i];
            XOR1 = XOR1^(i+1);
        }
        XOR1 = XOR1^n;

        System.out.println("The Missing Element is: "+(XOR1^XOR2));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
//        Brute(arr);
//        Better(arr);
//        Optimal_ADD(arr);
        Optimal_XOR(arr);
    }
}
