package OOPS;

//Like A Templete
public class Dog {

  //Special Function Constructor
  Dog(){
    System.out.println("making a dog Object");
  }

  Dog(String n,int a,String b){
    System.out.println("making a dog Object");
    name=n;
    age=a;
    breed=b;
  }

  String name;
  String breed;
  private int age; //Now the age is not access outside the Dog so to change the age of dog we have to call set age
  void  introduce(){
    if (age > 0) {
      System.out.println("Hi, I am "+age+" yrs old");
    }

  }
  int getAge(){
    return age;
  }

  //set Age
  void setAge(int newage){
    if (newage > 1) {
      age = newage;
    }

  }
}
