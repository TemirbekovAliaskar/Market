import java.time.ZonedDateTime;
import java.util.Scanner;

public class Client extends Card implements cardinterface {

    protected int age;
    protected Card card;
    protected Basket basket;
    protected double ostatkiBalans = 0;


    public Client(String firstName, String lastName, int age, Card card, Basket basket) {
        super(firstName, lastName, card.cardNumber, card.balans, card.password);
        this.age = age;
        this.card = card;
        this.basket = basket;
    }

    @Override
    public void payWithCard(double money1) {

        double money = 0;

        for (int i = 0; i < basket.count; i++) {
            money += basket.products[i].price;
        }

        if (money >= 100) {
            System.out.println("Password !");
            String passWord = new Scanner(System.in).nextLine();

            if (checkPassword(passWord)) {
                if (balans >= money) {
                    balans -= money;
                    for (int i = 0; i < basket.count; i++) {
                        System.out.println(basket.products[i].productsName + " " + basket.products[i].price + "Dollar");
                    }
                    System.out.println("All sum " + money + "Dpllar.   Date :" + ZonedDateTime.now());
                    ostatkiBalans = card.balans ;
                    ostatkiBalans -= money;
                } else System.out.println("Not summa ");
            } else System.out.println("Error password !");


        } else {
            if (balans >= money) {
                balans -= money;
                for (int i = 0; i < basket.count; i++) {
                    System.out.println(basket.products[i].productsName + " " + basket.products[i].price + "Dollar");
                }
                System.out.println("All sum money " + money + "Dollar.    Date :" + ZonedDateTime.now());
                ostatkiBalans = card.balans ;
                ostatkiBalans -= money;
            } else System.out.println("Not summa ");
        }
    }

    @Override
    public double getCardBalance() {
        return ostatkiBalans;
    }
}
