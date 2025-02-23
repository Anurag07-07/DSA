package Basic;

import java.util.Scanner;

public class ReverseTheInteger {
    static int Reverse(int N) {
        int ans = 0;
        while(N!=0){
            int last_digit = N%10;
            ans  = ans*10+last_digit;
            if ((ans<(Integer.MIN_VALUE)/10)||(ans>(Integer.MAX_VALUE)/10)) {
               return 0;
            }
            N/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int Number = sc.nextInt();
        System.out.println("The Original Number is: "+Number);
        System.out.println("The Reverse Number is: "+Reverse(Number));
    }
}
