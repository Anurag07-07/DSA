/*

Class
   -data members
   -methods

   Data Members can be public (by default) and they can be made private

   if you want to read private data,you can create a getter function
   if you want to write data,you can create a setter function inside the class

   Special Funtion=>Constructor (name is same class name)
   =>To init the Objects of that class (Parameterised Constructor)

   Class just like a templete, you have to craete Objects of that class

 */


package OOPS;

import java.util.Scanner;

public class OOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Way of Writing Code
//       Class is blueprint and house is object
        Dog d1 = new Dog(); //new Object
        d1.name = "Bruno";
//        d1.age = 12;
        d1.setAge(12);
        Dog d2 = new Dog();
        d2.name = "Cruto";
        System.out.println(d1.name +" Fighting with "+ d2.name);
        //Access the function inside Class
        d1.introduce();
        d2.introduce();
        d2.setAge(5);
//        System.out.println(d2.age);

        System.out.println(d1.getAge());

        Dog d3 = new Dog("Moti",10,"Village");
        System.out.println(d3.name);

    }
}
