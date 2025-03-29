package Array;

import java.util.Scanner;

public class ColwithLargestSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Rows");
        int rows = sc.nextInt();
        System.out.println("Enter The Cols");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < cols; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum+=arr[j][i];
            }
            if (sum>largest){
                largest = sum;
            }
        }

        System.out.println("The Largest Sum is: "+largest);
    }
}
