package Recursion;

import java.util.Scanner;

public class MoneyCounting {
    static void Print(int[] arr,int money){
        //Base Condition
        if(money==0){
            return;
        }

        //Find the Coin which is just less than Original Money
        int i;
        for (i = arr.length-1; i>=0 ; i--) {
            if (arr[i] <= money) {
                break;
            }
        }

        int leftmoney = money-arr[i];
        System.out.println(arr[i]+" ");
        Print(arr,leftmoney);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] money = {1,2,5,10,20,50,100,200,500,1000,2000};
        System.out.println("Enter The Amount");
        int amount = sc.nextInt();
        Print(money,amount);
    }
}
