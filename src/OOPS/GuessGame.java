package OOPS;

import java.util.Scanner;

class Player{
    String name;
    int guess; //Object Variable => its Different for all objects of the class
    static Scanner sc = new Scanner(System.in); //Class Variable => shared across all objects of the class

    Player(String name){
        this.name = name;
    }

    void makeguess(){
        guess = (int)(Math.random()*10);
        System.out.println(name+" is guessing "+guess);
    }
}

class Game{
    int expectedGuess;
    Player p1,p2,p3;


    Game(String name1,String name2,String name3){
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    private boolean checkWinner(){
        if (p1.guess == expectedGuess) {
            System.out.println(p1.name+" is Winner");
            return true;
        } else if (p2.guess == expectedGuess) {
            System.out.println(p2.name+" is Winner");
            return true;
        }else if (p3.guess ==expectedGuess){
            System.out.println(p3.name+" is Winner");
            return  true;
        }
        return false;
    }

    public void start(){
        System.out.println("Welcome To The Game");
        expectedGuess = (int)(Math.random()*10);
        System.out.println("The Number to Guess is: " +expectedGuess);

        while (true){
            p1.makeguess();
            p2.makeguess();
            p3.makeguess();
            boolean someOneWins = checkWinner();
            if (someOneWins) {
                break;
            }else {
//                Update the Guess
                expectedGuess = (int)(Math.random()*10);
            }
        }
    }
}

public class GuessGame {
    public static void main(String[] args) {
        Game g = new Game("Anurag","Anuradha","Rakesh");
        g.start();
    }
}
