import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks ={10,20,30,40,50};
//        int[] arr = new int[40];

        //User Input
//        for (int i = 0; i < 5; i++) {
//            arr[i] = sc.nextInt();
//        }

        //Output
//        Type 1
//        for (int i = 0; i < 5; i++) {
//            System.out.print(marks[i]+" ");
//        }
//        Type 2
        for (int x : marks){
            System.out.print(x+" ");
        }
    }
}
