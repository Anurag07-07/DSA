import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating the arraylist
        Integer num = sc.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(2,40);
        //update
        arrList.set(1,12);

        System.out.println(arrList.get(2));

//        Way 1
        for (int x : arrList){
            System.out.print(x+" ");
        }

        System.out.println();

//        Way 2
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i)+" ");
        }

        System.out.println();

        //primitive
        int x = 5;
        //Object
        Integer y = 5;
        ArrayList<Integer> a = new ArrayList<>();
        a.add(y);
        a.add(x); //autoboxing
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(60);
        a.add(num);
        a.add(num);

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
        }

        System.out.println();

        //remove both the number
        while (a.contains(num)){
            a.remove(num);
        }

//        a.remove(1); //remove element by index
//        a.remove(Integer.valueOf(40)); //remove element by giving value
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
        }
    }
}
