import java.util.Scanner;

public class GCD {

    public static int gcd(int a ,int b){
        int a_,b_;
        while (a!=0){
            a_ =  b%a;
            b_ = a;

            //updating the value of a and b
            a = a_;
            b = b_;

        }
      return  b;
    }

    public  static  int LCM(int a ,int b){
        int lcm = a*b/gcd(a,b);
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(LCM(a,b));
    }
}
