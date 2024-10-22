public class StringBuliderdemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("world");
        //minimum capacity insure
        sb.ensureCapacity(1000);
        System.out.println(sb.toString());
    }
}
