package MandS.picking.lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Product {

    ArrayList<Product> products = new ArrayList<>();
    String upc;
    String productName;

    public Product(String upc, String productName) {
        this.upc = upc;
        this.productName = productName;
    }

    public void readFromFile() {

        System.out.println("------Unsorted------");
        String fileName = "pickingList.txt";
        ClassLoader classLoader = getClass().getClassLoader();

        try (Scanner reader = new Scanner(new File(classLoader.getResource(fileName).getFile()))) {
            while (reader.hasNext()) {
                productName = reader.next();
                upc = reader.next();

                Product p = new Product(upc, productName);
                products.add(p);

                System.out.println(products);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public String toString() {
        return "Product Name: " + productName + " UPC: " + upc;
    }

    public void sortProducts() {

        System.out.println("-------Sorted-------");

        products.sort(new SortByLast3Digits());

        System.out.println(products);
    }
}

