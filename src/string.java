import java.util.Scanner;

public class string {
    public  static  void largeststring(){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int largestLen = 0;
        String largestString = "";
        for (int i = 1; i <= n ; i++) {
            String line = sc.nextLine();
            if (line.length()>largestLen){
                largestString =line;
                largestLen = line.length();
            }
        }

        System.out.println(largestString);
    }

    public static  void  string(){
        String s = "   artificial intelligence and machine learning    ";
//        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.strip());
        System.out.println(s.strip().length());
        System.out.println(s.replace("machine learning","Data Science"));

        //String Concatenation
        String name = "my name is Anurag raj";
        if (name.contains("Anurag")) {
            System.out.println("It Contains Anurag");
        }
    }

    public  static  void filterFiles(){
        String[] filenames = {"img1.jpg","img2.png","d1.pdf","d3.pdf"};
        for (String f:filenames){
            if (f.endsWith(".pdf")){
                System.out.println(f);
            }
        }
    }

    public  static  void printoccurance(){
        String doc = "this is a very large document on java,java can handle large large numbers";
        String word = "large";
        int ind = doc.indexOf(word);
//        System.out.println(ind);

        while(ind !=-1){
            System.out.println(ind);
            //find next occ
            ind = doc.indexOf(word,ind+1);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String a = "Hello";
//        String b = "Hello";
//        String c = b;
//        if (c == a && b==c && a==c) {
//            System.out.println("They are Equal");
//        }else {
//            System.out.println("Not Equal");
//        }

        //By using new we create two Different Object
//        String s1 = new String("Hello");
//        String s2 = new String("Hello");
//        if (s1 == s2) {
//            System.out.println("Equal");
//        }
//        else {
//            System.out.println("Not Equal");
//        }

//        System.out.println(s1.equals(s2));
        //String is Immutable nad It cannot be modified

        //to check character
//        System.out.println(s1.charAt(0));

        //char Array
//        char arr[] = s1.toCharArray();
//        arr[0] = 'B';
//        System.out.println(arr);
//        System.out.println(s1);

//        String name = sc.nextLine();
//        System.out.println("My name is "+name);
//        System.out.println(name.stripLeading());

//        int n = sc.nextInt();
//        //consume the first enter
//        sc.nextLine();
//
//        for (int i = 1; i <= n; i++) {
//            String line = sc.nextLine();
//            System.out.println(line);
//        }
//
//

//        largeststring();

//        string();
        filterFiles();
        printoccurance();

        String greet = "Hi Everyone Hi all";
        System.out.println(greet.indexOf("Hi",2));

    }
}
