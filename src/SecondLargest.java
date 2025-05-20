import java.util.Arrays;

public class SecondLargest {
    //We Are Considering only Postive Element
    //If Negative Elemnet is There we take min value as Integer.MIN_VALUE;
    public static void Brute(int[] arr) {
        int n = arr.length;

        //Sort The Array And Find The Largest
        //TC = O(nlogn)
        Arrays.sort(arr);

        int largest = arr[n-1];

        //Iterate over the array from second last
        //Check if the element is not equal to largest
        //Store inside second largest and break the loop
        //TC = O(n)

        int slargest = -1;
        for (int i = n-2; i >= 0 ; i--) {
            if (arr[i] != largest) {
                slargest = arr[i];
                break;
            }
        }

        System.out.println("The Second Largest Element: "+slargest);
    }

    public static void Better(int[] arr) {
        int n = arr.length;

        //Find the Largest Element Using For Loop
        //TC = O(n)
        int largest = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i]>largest){
                largest = arr[i];
            }
        }

        //Iterate Over the Array
        //If element is greater than second largest and not equal largest
        //Store that element inside Second Largest
        //TC = O(n)
        int slargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > slargest && arr[i] != largest ) {
                slargest = arr[i];
            }
        }

        System.out.println("The Second Largest Element: "+slargest);
    }

    public static void Optimal(int[] arr) {
        int n = arr.length;

        //Take largest as first element and second largest as -1
        //Iterate Over an array
        //If element is greater than largest
        //Store largest inside second largest and that element inside largest
        //If Element is smaller than largest but greater than second largest
        //Store that element Inside Second largest
        //TC = O(n)

        int largest = arr[0],slaregst = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i]>largest){
                slaregst = largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i]>slaregst) {
                slaregst = arr[i];
            }
        }
        System.out.println("The Second Largest Element: "+slaregst);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        Brute(arr);
        Better(arr);
        Optimal(arr);
    }
}
