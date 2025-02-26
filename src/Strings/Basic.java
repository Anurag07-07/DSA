package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "Hello World";
        String b = "Hello World";

        //But

        String a1 = new String("Hello World");
        String b1 = new String("Hello World");

        System.out.println(a==b);
        System.out.println(a1==b1);
        //To Check String Length
        System.out.println(a.length());

        // Java String are immutable (Value can't be change)

        //To Compare 2 Strings it compare the value not the address
        System.out.println(a1.equals(b1));
        System.out.println(a1.charAt(2));

        //Convert String into char array
        char[] arr = a1.toCharArray();
        arr[0] = 'B'; //It can't change the original Array
        System.out.println(Arrays.toString(arr));

        //Its Take Input till space not come
        String first_name = sc.next();
        System.out.println(first_name);
        String full_name = sc.nextLine();
        System.out.println(full_name);
    }
}
