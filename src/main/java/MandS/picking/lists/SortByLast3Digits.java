package MandS.picking.lists;

import java.util.Comparator;

public class SortByLast3Digits implements Comparator<Product> {

    public String getLast3Digits(Product product) {

        String completeUPC = product.upc;
        String last3Digits = completeUPC.substring(3, 5);

        return last3Digits;
    }

    @Override
    public int compare(Product product1, Product product2) {

        return getLast3Digits(product1).compareTo(getLast3Digits(product2));
    }
}
