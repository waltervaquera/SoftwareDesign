package ProductsSales;

public class ProductSale {
    private Product product;
    private ISaleMethod saleMethod;

    public ProductSale(Product product, ISaleMethod saleMethod) {
        this.product = product;
        this.saleMethod = saleMethod;
    }

    public void sellProduct(int saleQuantity) {
        double salePrice = saleMethod.getSalePrice(product, saleQuantity);

        System.out.println("\nProduct Sold: " + product.getName());
        System.out.println("Sale Quantity: " + saleQuantity);
        System.out.println("Sale Price: " + salePrice);
        System.out.println("Remaining Quantity in Stock: " + product.getStockQuantity());
    }
}
