package Strings;

public class StringBuild {
    //String is Immutable
    //Sometime we need to update the value
    //Default is 16 Size
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.ensureCapacity(1000);
        sb.append("world");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.insert(1,"iii");
        System.out.println(sb);
        System.out.println(sb.toString());

        //StringBuilder can't Create New Array and aad element in the same Array and if
        //Size Increase The String Builder Expands
        //But in String It create new array and copy previous element to new array and then add the both element
    }



}
