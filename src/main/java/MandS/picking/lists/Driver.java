package MandS.picking.lists;

public class Driver {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();

        fileReader.readFromFile();
        fileReader.sortProducts();
    }
}
