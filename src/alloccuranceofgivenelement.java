import java.util.Arrays;
import java.util.Scanner;

public class alloccuranceofgivenelement {

    public static void occurance(int[] arr,int element) {
        int n = arr.length;
        int[] index = new int[n];
        int count = 0,j=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==element){
                index[j] = i;
                j++;
                count++;
            }
        }

        System.out.println("Total Number of Element Present: "+count);
        System.out.println("Index of the Element is: "+Arrays.toString(Arrays.copyOf(index,count)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,20,30,40,50};
        System.out.println("Enter The Element");
        int element = sc.nextInt();
        int n = arr.length;
        occurance(arr,element);
    }
}
