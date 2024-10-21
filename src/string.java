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

        largeststring();
    }
}
