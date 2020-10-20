public class Test {
    public static void main(String[] args) {
        Output output = new Output();
        Product[] product = new Product[3];
        product[0] = new Product("Jabłko", "Papierówka", 10, "owoce i warzywa");
        product[1] = new Product("Krakersy", "Solone", 12, "na chrupko");
        product[2] = new Product("Długopis", "Czarny", 8, "biurowe");

        output.printer(product[0]);
        output.printer(product[1]);
        output.printer(product[2]);


    }
}