public class PriceManagement {

    public double calculateNetPrice(Product product) {
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

