package Strings;

import java.util.Scanner;

public class FindLargestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number Of String");
        int N = sc.nextInt();

        sc.nextLine();
        String largest_String="";
        int Largest_String_Length=0;

        for (int i = 1; i <=  N; i++) {
            System.out.println("Enter The String");
            String value = sc.nextLine();

            if (value.length() > Largest_String_Length) {
                largest_String = value;
                Largest_String_Length = value.length();
            }
        }
        System.out.println("The Largest String");
        System.out.println(largest_String);
        System.out.println("The Length is");
        System.out.println(Largest_String_Length);


    }
}
