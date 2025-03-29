package Array;

import java.util.Scanner;

public class PrintallDiagonal {
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

        for (int i = 0; i < cols; i++) {
            int X = 0, Y = i;
            while(X<rows && Y>=0){
                System.out.print(arr[X][Y]+" ");
                X++;Y--;
            }
        }

        for (int i = 1; i < rows; i++) {
            int X = i, Y = cols-1;
            while(X<rows && cols>=0){
                System.out.print(arr[X][Y]+" ");
                X++;Y--;
            }
        }
    }
}
