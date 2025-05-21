package ArrayandHashing;

import java.util.Arrays;

public class isAnagram {

    public static boolean Brute_UsingSorting(String s,String t) {

        if (s.length()!=t.length()){
            return false;
        }

        //Convert String into Char Array
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        //Sort The Char Array
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr,tarr);
    }

    public static Boolean Better_Hashing(String s,String t) {

        if (s.length()!=t.length()){
            return false;
        }

        //Create a set of length 26 to store the occurance of character in S
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;  //Here we increase the count if that character present
            count[t.charAt(i)-'a']--;  //Here we decrease the count if that character present
        }

        for (int val:count){
            if (val!=0){    //If at any point any char left it means both string don't have same character
                return false; //No anagram
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "spar";
        String t = "psar";
        if (Better_Hashing(s,t)){
            System.out.println("is Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}
