package Basic;

import java.util.Scanner;

public class GCD {

    public static int GCD(int a,int b) {
        while(a!=0){
            int a_ = b%a;
            int b_ = a;
            a = a_;
            b = b_;
        }
        return b;
    }

    public static int LCM(int a,int b) {
        int lcm = (a*b)/GCD(a,b);
        return  lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number");
        int b = sc.nextInt();

        System.out.println("The GCD of "+a+" and "+b+" is: "+GCD(a,b));
        System.out.println("The LCM of "+a+" and "+b+" is: "+LCM(a,b));
    }
}
