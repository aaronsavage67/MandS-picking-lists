package MandS.picking.lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {

    TreeMap<Integer, String> products = new TreeMap<>();

    public void readFromFile() {

        String fileName = "pickingList.txt";
        ClassLoader classLoader = getClass().getClassLoader();

        try (Scanner reader = new Scanner(new File(classLoader.getResource(fileName).getFile()))) {
            while (reader.hasNext()) {
                String productName = reader.next();
                int upc = reader.nextInt();
                products.put(upc, productName);
                System.out.println(productName + ", " + upc);
                System.out.println(products);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public void sortProducts() {

    }
}

