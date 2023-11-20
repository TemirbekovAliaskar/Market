import java.lang.reflect.Array;
import java.util.Arrays;

public class Basket extends Product {

    protected Product[] products;

    protected int count;

    public Basket(){
        this.products = new Product[0];
        this.count = 0;
    }

    public Basket(String name, int price, Product[] products, int count) {
        super(name, price);
        this.products = products;
        this.count = count;
    }

    public Product[] addProduct(Product product){
        products = Arrays.copyOf(products,products.length + 1);
        products[products.length - 1] = product;
        count++;

        return products;
    }
}
