package Basic;

/*
 Class is used to define the structure of Object
* */

//Create Class

class Alarm{
    int start_time;
    int current_time;
    void ring(){
        if (current_time == start_time) {
            System.out.println("Ringing....");
        }else {
            System.out.println("Alarm Ring At 5");
        }
    }
}

public class MemoryManagement {
    public static void main(String[] args) {

        //Creating Object 1

        Alarm A = new Alarm();
        A.current_time = 5;
        A.start_time = 5;
        A.ring();

        //Creating Object 2

        Alarm B = new Alarm();
        B.current_time = 8;
        B.start_time = 5;
        B.ring();
    }
}
