public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Water", 20, 12, 20);
        basket.add("Butter", 57, 34.5);
        basket.add("Apple", 23, 2, 4.5);
        basket.add("Bread", 15, 4);
        basket.add("Grape", 78, 9, 13.7);

        System.out.println("Общий вес товаров равен " + basket.getGeneralWeight());
        basket.print("");


        Printer printer = new Printer();
        printer.append("qwer", "first document", 3);
        printer.append("qwedffvr", "second document", 7);
        printer.append("Document", "another document");
        printer.append("Text");

        printer.print();
    }
}
