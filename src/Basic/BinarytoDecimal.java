package Basic;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number");
        int N = sc.nextInt();

        int ans = 0,power = 1;
        while(N!=0){
            int last_digit = N%10;
            ans = ans + last_digit*power;
            power = 2*power;
            N/=10;
        }

        System.out.println(ans);
    }
}
