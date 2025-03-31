package BitManipulation;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int N = sc.nextInt();
        int ans = 0,power = 1;
        while (N>0){
            int last_Digit = N%10;
            ans = ans + last_Digit*power;
            power = power*2;
            N/=10;
        }

        System.out.println("The Decimal Number is :"+ans);
    }
}
