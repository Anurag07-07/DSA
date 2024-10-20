import java.util.Arrays;
import java.util.Scanner;

public class two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int start = 0,end = n-1;
        //Before Using Two Pointer ALways Use Sorting
        Arrays.sort(arr);
        //Printing Output Array
        System.out.println(Arrays.toString(arr));
        while(start<end){
            int sum = arr[start]+arr[end];
            if (sum==target){
                System.out.println(start+" "+end);
                break;
            } else if (sum>target) {
                end--;
            }
            else {
                start++;
            }
        }
    }
}
