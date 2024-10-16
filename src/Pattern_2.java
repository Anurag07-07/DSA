import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    1
//    2 3
//    4 5 6
//    7 8 9 10

        int n = sc.nextInt();
        int value = 1;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }

    }
}
