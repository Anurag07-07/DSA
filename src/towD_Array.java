import java.util.Arrays;
import java.util.Scanner;

public class towD_Array {
    public  static  void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public  static  int[][] create2DwithVariablecols(){
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int[][] arr  = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.println("Tell Col in "+ i + " row");
            int cols = sc.nextInt();
            //Create array of columns
            arr[i] = new int[cols];
            //Take Input
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return  arr;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         int[][] arr = createUserInput();
        int[][] arr2 = create2DwithVariablecols();
//         printArray(arr);
        printArray(arr2);

//        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
//        2D array is the 1D array of objects

        //Printing Array Method 1
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[0].length; j++) {
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        //Printing Array Method 2
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(Arrays.toString(arr1[i]));
//        }

    }
}