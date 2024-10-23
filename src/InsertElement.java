import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        System.out.println("Enter The Element to be Inserted");
        int element = sc.nextInt();
        System.out.println("Enter The Position");
        int pos = sc.nextInt();
        int n = arr.length;
        for (int i = n-1; i >=pos-1 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos-1] = element;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
