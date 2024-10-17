public class Examplefunction {

    public static int shopping(String item1, String item2,int money) {
        int cost1 = 20;
        int cost2 = 50;
        System.out.println("Bringing "+item1+" and "+item2);
        return money-cost1-cost2;
    }

    public static void main(String[] args) {
        int money = 100;
        int remMoney = shopping("Apple","Orange",money);
        System.out.println("Total left Money is "+remMoney);
    }
}