public class Output {
    private PriceManagement price = new PriceManagement();

    public void printProductNetPrice(Product product) {
        double netPrice = price.calculateNetPrice(product);
        if (netPrice == 0) {
            System.out.println("Brak takiej kategorii.");
        } else {
            System.out.println(product.getName() + ", " + product.getDescription() + ", Cena brutto: " +
                    product.getGrossPrice() + ", Kategoria: " + product.getCategory() + ", Cena netto: " + netPrice + "\n");
        }
    }
}

