package Array;

import java.util.Arrays;
import java.util.Scanner;

/*
* N = 8
* arr = 5 6 7 2 7 3 7 4
* target = 7
* return index of 7
* Output = [2,4,6]
*
* */

public class Occurence1 {

    static int[] Occurance(int[] arr,int element) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element){
                cnt++;
            }
        }

        int[] ans = new int[cnt];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                ans[j] = i;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter The Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter The Element");
        int element = sc.nextInt();

        System.out.println(Arrays.toString(Occurance(arr,element)));
    }
}
