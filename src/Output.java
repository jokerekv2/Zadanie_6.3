public class Output {
    PriceManagement price = new PriceManagement();

    public void printer(Product product) {
        double netPrice = price.netPrice(product);
        if (netPrice == 0) {
            System.out.println("Brak takiej kategorii.");
        } else {
            System.out.println(product.getName() + ", " + product.getDescription() + ", Cena brutto: " +
                    product.getGrossPrice() + ", Kategoria: " + product.getCategory() + ", Cena netto: " + netPrice + "\n");
        }
    }
}

