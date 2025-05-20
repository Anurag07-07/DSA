import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

    public static void Brute(int[] arr){
        int n = arr.length;

        //Sort The Array   O(nlogn)
        Arrays.sort(arr);

        //Find The Last Element O(1)
        int largest = arr[n-1];

        System.out.println("The Largest Element: "+largest);
    }

    public static void Optimal(int[] arr) {
        int n = arr.length;


        //Take First Element as Largest
        //Iterate over an array
        //Check if any element is greater than largest
        //Put largest equals that element
        //Time Complexity = O(n)
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The Largest Element: "+largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,1,5,2};
        Brute(arr);
        Optimal(arr);
    }
}