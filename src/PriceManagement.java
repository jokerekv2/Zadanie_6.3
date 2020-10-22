import java.util.Scanner;

public class PriceManagement {
    private Scanner sc = new Scanner(System.in);
    private Output output = new Output();

    public void calculateNetPrice(Product product) {
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

    public void calculateNetPrice(Product[] product) {
        System.out.println("Podaj szukaną kategorię: ");
        String category = getWantedCategory();
        for (int i = 0; i < product.length; i++) {
            if (product[i].getCategory().equals(category)) {
                calculateNetPrice(product[i]);
            }
        }
    }

    private String getWantedCategory() {
        return sc.nextLine();
    }

}

