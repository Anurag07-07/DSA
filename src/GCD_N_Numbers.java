import java.util.Scanner;

public class GCD_N_Numbers {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10 20 40 12 6
        // To 10 ko single number to uska gcd wo khud hai
        // now uska gcd next element se lenge and usko ans
        // ke andar store kar lenge and then next element
        // se fir gcd lenge

        int n = sc.nextInt();
        int ans = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int no = sc.nextInt();
            ans = gcd(ans,no);
        }

        System.out.println(ans);
    }
}
