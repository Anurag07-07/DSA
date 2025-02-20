package Basic;

import java.util.Scanner;

public class GCDOfNNumbers {

    public static int GCD(int a,int b) {
        while(a!=0){
            int a_ = b%a;
            int b_ = a;
            a = a_;
            b = b_;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Total Number");
        int N = sc.nextInt();
        System.out.println("Enter The First Number");
        int first = sc.nextInt();
        int ans = first;

        for (int i = 2; i <= N ; i++) {
            System.out.println("Enter the "+i+" Number");
            int value = sc.nextInt();
            ans = GCD(ans,value);
        }


        System.out.println("The GCD of all The Numbers is: "+ans);
    }
}
