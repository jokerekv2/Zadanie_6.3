import java.util.Scanner;

public class BoxOfProducts {
    private Scanner sc = new Scanner(System.in);

    public Product[] fillProductBox() {
        System.out.print("Podaj ilość produktów: ");
        int sizeOfBox = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[sizeOfBox];
        for (int i = 0; i < sizeOfBox; i++) {
            products[i] = setProductsInfo();
        }
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
