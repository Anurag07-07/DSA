import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Binary to Decimal
        int N = sc.nextInt();
//        int  p = 1,ans=0;
//        while (N!=0){
//            ans = ans+N%10*p;
//            p=p*2;
//            N/=10;
//        }
//        System.out.println(ans);


// ##########################################################################
        int  p = 1,ans = 0;
        while(N!=0){
            ans = ans + (N%2)*p;
            p*=10;
            N/=2;
        }

        System.out.println(ans);

    }
}