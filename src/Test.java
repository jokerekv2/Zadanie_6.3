public class Test {
    public static void main(String[] args) {
        BoxOfProducts boxOfProducts = new BoxOfProducts();
        PriceManagement priceManagement = new PriceManagement();
        priceManagement.compareAndSumNetPrice(boxOfProducts.fillProductBox());
    }
}