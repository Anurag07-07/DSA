import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("Hello World");
//        }

//  ######################################################

//    int col = 0;
//    while(col<n){
//        System.out.println("Run");
//        col=col+1;
//    }

//  #######################################################

    //All Number from N to 1
//    while(n>=1){
//        System.out.println(n);
//        n--;
//    }

//  #######################################################

    //All Even Number from  1 to N
//    int even = 0;
//    while(even<=n){
//        System.out.println(even);
//        even = even+2;
//    }

//  ########################################################

    //Sum of all number from 1 to n
//    int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum+i;
//        }
//
//        System.out.println(sum);

//  ##################################################

    //Sum of all Odd Numbers
//        int sum = 0;
//        for (int i = 1; i <= n; i=i+2) {
//            sum = sum+i;
//        }

//        System.out.println(sum);

//  #####################################################

//   Print Multiple of 4

//        for (int i = 1; i < n; i++) {
//            if(i%4==0){
//                System.out.println(i);
//            }
//        }

//  #######################################################

//        //Factorial
//        int ans = 1;
//        for (int i = 1; i <= n; i++) {
//            ans = ans*i;
//        }
//        System.out.println(ans);


//  #################################################

//        print series of 3i+2 which is not multiple of 5

        for (int i = 1; i <= n; i++) {
            int ans = 3*i+2;
            if (ans%5 != 0) {
                System.out.println(3*i+2+" ");
            }

        }

    }
}
