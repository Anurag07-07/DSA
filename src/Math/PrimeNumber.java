package Math;

import java.util.Scanner;

public class PrimeNumber {

    static boolean Brute(int x) {
        for (int i = 2; i < x; i++) {
            if (x%i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean Optimised(int x) {
        for (int i = 2; i*i <= x  ; i++) {
            if (x%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        if (Optimised(number)) {
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
}
