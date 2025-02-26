package Strings;

import java.util.Scanner;

public class StrObject {

    public static void FilterFiles() {
        String[] filenames = {"img.jpg","d1.pdf","apple.pdf","disc.sys","image2pdf.png"};
        for (String x : filenames){
            if (x.endsWith(".pdf")) {
                System.out.print(x+" ");
            }
        }
    }

    public static void printOcc() {
        String doc = "this is a very large document on java,java can handle large number which are used for large";
        String word = "large";

        //Print First Occurance
        int index = doc.indexOf(word);
        System.out.println(index);

        //Print All Occurance
        while(index!=-1){
            System.out.println(index);
            //Find the next Occurance
            index = doc.indexOf(word,index+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Hello Myself Anurag Raj      ";
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.strip().length());
        System.out.println(s.replace("Anurag","Aniket"));

        //Convert The Char Array in String
        char[] arr = {'A','N','U'};
        String name = new String(arr);
        System.out.println(name);

        //Check If Word is there or not
        if (s.contains("Anurag")) {
            System.out.println("Yes it Contains");
        }

        FilterFiles();
        System.out.println();
        printOcc();

    }
}
