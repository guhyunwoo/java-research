class Money extends Object {
    int money;

    Money() {}

    Money(int money) {
        this.money = money;
    }
}



public class Main {
    public static void main(String[] args) {
        Money myMoney = new Money(100);

        Object price = new Money();

        System.out.println(price.equals(myMoney));
    }
}