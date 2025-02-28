package Math;

import java.util.Scanner;

public class SumofDivisor {

    static int Sum_Brute(int x) {
        int sum = 0;
        for (int i = 1; i <= x ; i++) {
            if (x%i == 0) {
                sum = sum+i;
            }
        }
        return sum;
    }

    static int Sum_Better(int x) {
        int sum = 0;
        for (int i = 1; i*i <= x ; i++) {
            if (x%i == 0) {
                if (i*i==x) {
                    sum = sum+i;
                }else {
                    sum = sum+i+(x/i);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        System.out.println("The Sum of Divisor is: "+Sum_Brute(number));
        System.out.println("The Sum of Divisor is: "+Sum_Better(number));
    }
}
