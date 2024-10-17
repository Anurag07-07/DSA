import java.util.Scanner;

public class LinearSearch {

    public  static  int Linear_Search(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,25,18,16};
        int target= 18;
        int element = Linear_Search(arr,target);
        System.out.println(element);

        //Floor Give previous Integer Floor(10.8) = 10
        //Ceil Give round to next Number ceil of 10.2 = 11
        //Round Round upto nearest Integer like 10.2 = 10 10.8 = 11
    }
}
