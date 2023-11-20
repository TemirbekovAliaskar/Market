public class Main {
    public static void main(String[] args) {


        Card card = new Card("Jigit","Turumbekov",4444,50000,"1234");

        Basket basket = new Basket();
        basket.addProduct(new Product("Kymyz",222));
        basket.addProduct(new Product("Milk",300));
        basket.addProduct(new Product("Airan",100));
        basket.addProduct(new Product("Kapusta",1000));

        Client client = new Client("Jigit","Tyrumbekov",20,card,basket);

        client.payWithCard(card.balans);

        System.out.println("Balance   :  " + client.getCardBalance());


    }
}