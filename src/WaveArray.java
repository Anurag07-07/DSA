import java.util.Scanner;

public class WaveArray {
    public  static  void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public  static  int[][] createUserInput(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        //User Input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public  static int[][] wavearray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(arr[row][col]+" ");
                }
            } else {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(arr[row][col]+" ");
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = createUserInput();
        printArray(arr);
        wavearray(arr);
        }
}