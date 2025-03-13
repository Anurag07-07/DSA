package Recursion;

import java.util.Scanner;

public class HomeComing {

    static void HomeComing(int X,int Home){
        if (X == Home) {
            System.out.println("Reached Home");
            return;
        }
        System.out.println(Home-X+" Step Closer");
        HomeComing(X+1,Home);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HomeComing(0,5);
    }
}
