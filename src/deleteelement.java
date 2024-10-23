import java.util.Arrays;
import java.util.Scanner;

public class deleteelement {

    public  static  int linearsearch(int[] arr,int element){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    public  static  void deleteelement(int[] arr,int index){
        int n = arr.length;
        for (int i = index; i < n-1  ; i++) {
            arr[i] = arr[i+1];
        }

        System.out.println("Array after deletion: " + Arrays.toString(Arrays.copyOf(arr, n - 1)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        System.out.println("Enter The Element to be Deleted");
        int element = sc.nextInt();
        int n = arr.length;
        int value = linearsearch(arr,element);
        if (value==-1){
            System.out.println("Element not present");
        }
        else {
            deleteelement(arr,value);
        }
    }
}
