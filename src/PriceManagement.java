import java.util.Scanner;

public class PriceManagement {
    private Scanner sc = new Scanner(System.in);
    private Output output = new Output();

    public void compareAndSumNetPrice(Product[] product) {
        System.out.println("Podaj szukaną kategorię: ");
        String category = sc.nextLine();
        double sumNetPrice = 0;
        double netPrice;
        for (int i = 0; i < product.length; i++) {
            if (product[i].getCategory().equals(category)) {
                netPrice = calculateNetPrice(product[i]);
                sumNetPrice += netPrice;
                output.printProductNetPrice(product[i], netPrice);
            }
        }
        System.out.println("Łączna suma cen netto produktów wybranej kategorii wynosi: " + sumNetPrice);
    }

    private double calculateNetPrice(Product product) {
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
        return netPrice;
    }
}

