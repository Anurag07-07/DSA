package Basic;

import java.util.Scanner;

public class DecimalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int N = sc.nextInt();

        //Input 57   //Output 111001

        int ans = 0,power = 1;

        while(N!=0){
            int rem = N%2;
            ans = ans + rem*power;
            power = power*10;
            N/=2;
        }

        System.out.println(ans);
    }
}
