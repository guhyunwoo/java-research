import java.util.Objects;

class Money {
    int money;

    Money(int money) {
        this.money = money;
    }
}

public class Main {
    public static void main(String[] args) {
        Money price = new Money(100);
        Money myMoney = new Money(100);

        System.out.println(price.equals(myMoney));
    }
}