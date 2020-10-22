import java.util.Scanner;

public class BoxOfProducts {
    private Product[] products = new Product[3];
    private Scanner sc = new Scanner(System.in);

    public void fillProductBox() {
        for (int i = 0; i < products.length; i++) {
            products[i] = setProductsInfo();
        }
    }

    public Product[] getProducts() {
        return products;
    }

    private Product setProductsInfo() {
        System.out.print("Podaj nazwę produktu: ");
        String name = sc.nextLine();
        System.out.print("Podaj opis: ");
        String description = sc.nextLine();
        System.out.print("Podaj cenę brutto: ");
        double grossPrice = sc.nextDouble();
        sc.nextLine();
        System.out.print("Podaj kategorię: ");
        String category = sc.nextLine();

        return new Product(name, description, grossPrice, category);
    }
}
