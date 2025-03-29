package Array;

import java.util.Scanner;

public class Diagonal {
    public static void Brute(int[][] arr,int rows,int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        return;
    }

    public static void Better(int[][] arr,int rows,int cols) {
        int X = 0,Y = 0;
        while(X<rows && Y<cols){
            System.out.print(arr[X][Y]+" ");
            X++;Y++;
        }
        return;
    }

    public static void Better_oppositeDiagonal(int[][] arr,int rows,int cols) {
        int X = 0,Y = cols-1;
        while (X<rows && Y>=0){
            System.out.print(arr[X][Y]+" ");
            X++;Y--;
        }
    }

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

//        Brute(arr,rows,cols);
//        Better(arr,rows,cols);
        Better_oppositeDiagonal(arr,rows,cols);
    }
}
