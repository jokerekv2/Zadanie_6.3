import java.util.Scanner;

public class PriceManagement {
    private Scanner sc = new Scanner(System.in);
    private Output output = new Output();

    public void compareAndSumGrossPrice(Product[] product) {
        System.out.println("Podaj szukaną kategorię: ");
        String category = sc.nextLine();
        double sumGrossPrice = 0;
        for (int i = 0; i < product.length; i++) {
            if (product[i].getCategory().equals(category)) {
                calculateNetPrice(product[i]);
                sumGrossPrice += product[i].getGrossPrice();
            }
        }
        System.out.println("Łączna suma cen brutto produktów wybranej kategorii wynosi: " + sumGrossPrice);
    }

    private void calculateNetPrice(Product product) {
        double netPrice;
        switch (product.getCategory()) {
            case "owoce i warzywa":
                netPrice = product.getGrossPrice() * 0.9;
                break;
            case "na chrupko":
                netPrice = product.getGrossPrice() * 0.75;
                break;
            case "biurowe":
                netPrice = product.getGrossPrice() * 0.85;
                break;
            default:
                netPrice = 0;
        }
        output.printProductNetPrice(product, netPrice);
    }
}

