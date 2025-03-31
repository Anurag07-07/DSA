package BitManipulation;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int N = sc.nextInt();
        int ans = 0,power = 1;
        while (N>0){
            int rem = N%2;
            ans = ans + rem*power;
            power = power*10;
            N/=2;
        }

        System.out.println("The Binary Number is: "+ans);
    }
}
