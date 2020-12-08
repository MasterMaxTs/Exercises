package inheritance;

public final class LiquidationProduct {
    private Product product;                                 /** composition*/
    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
    }

    public String label() {
        return product.label();
    }
}
