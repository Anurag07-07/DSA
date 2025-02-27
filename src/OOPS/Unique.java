package OOPS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Unique {

    static Integer ans(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = ans^arr.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> value = new ArrayList<>(Arrays.asList(2,8,1,5,7,1,2,7,5));

        System.out.println("The Unique Number Is:  "+ans(value));
    }
}
