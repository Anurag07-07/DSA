package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeofMatrix {
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

        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j < cols; j++) {
                int temp  = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
