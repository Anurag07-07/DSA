package ArrayandHashing;

import java.util.Arrays;

public class CommanPrefixString {

    public static String Brute_VerticalScanning(String[] strs) {
        //Time Complexity  = O(n*m)

        int N = strs.length;
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs){
                if (s.length() == i || s.charAt(i)!= strs[0].charAt(i)) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    public static String Better_Sorting(String[] strs) {
        //Check if the array length is equal to 1
        if (strs.length == 1) {
            return strs[0];
        }

        //Sort The String
        Arrays.sort(strs);
        //This Sort The Array in lexographical Order and we have to compare only first and last
        //String to find longest comman prefix string because there lexographical difference is
        //largest

        //Find the Minimum length String as one of the string is finished we can't compare all the strings
        int N = Math.min(strs[0].length(),strs[strs.length-1].length());

        for(int i = 0; i < N; i++) {
            if (strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                return strs[0].substring(0,i);
            }
        }

        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs = {"dance","dag","danger","damage"};
        String ans1 = Brute_VerticalScanning(strs);
        System.out.println(ans1);
        String ans = Better_Sorting(strs);
        System.out.println(ans);
    }
}
