package MandS.picking.lists;

public class Driver {

    public static void main(String[] args) {

        String upc = null;
        String productName = null;

        Product product = new Product(upc, productName);

        product.readFromFile();
        product.sortProducts();
    }
}
